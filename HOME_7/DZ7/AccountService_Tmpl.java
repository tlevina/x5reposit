package DZ7;

public class AccountService_Tmpl implements AccountService {
    Account[] accounts;

    public AccountService_Tmpl(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public void withdraw(int accountId, double amount) throws NotEnouthMoneyException, UnKnownAccountException {
        boolean account_find = false;
        for (Account account : accounts) {
            if (account.Amount < amount) {
                throw new NotEnouthMoneyException(account.Amount);
            }
            if (account.getId() == accountId) {
                account.Amount = account.Amount - amount;
                account_find = true;
            }
        }
        if (account_find == false) {
            throw new UnKnownAccountException(accountId);
        }
    }

    @Override
    public void balance(int accountId) throws UnKnownAccountException {
        boolean account_find = false;
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                System.out.println("ID = " + account.id + " Holder = " + account.Holder + " Amount = " + account.Amount);
                account_find = true;
            }
        }
        if (account_find == false) {
            throw new UnKnownAccountException(accountId);
        }

    }

    @Override
    public void deposit(int accountId, double amount) throws NotEnouthMoneyException, UnKnownAccountException {
        boolean account_find = false;
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                account.Amount = account.Amount + amount;
                account_find = true;
            }
        }
        if (account_find == false) {
            throw new UnKnownAccountException(accountId);
        }
    }

    @Override
    public void transfer(int from, int to, double amount) throws NotEnouthMoneyException, UnKnownAccountException {
        boolean account_find = false;

        for (Account account : accounts) {
            if (account.getId() == from) {
                if (account.Amount < amount) {
                    throw new NotEnouthMoneyException(account.Amount);
                }
                account.Amount = account.Amount - amount;
                account_find = true;
            }
        }
        if (account_find == false) {
            throw new UnKnownAccountException(from);
        }
        if (account_find) {
            account_find = false;
            for (Account account : accounts) {
                if (account.getId() == to) {
                    account.Amount = account.Amount + amount;
                    account_find = true;
                }
            }
        }
        if (account_find == false) {
            throw new UnKnownAccountException(to);
        }

    }
}

