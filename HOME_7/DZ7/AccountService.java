package DZ7;

public interface AccountService {
    //снять указанную сумму
    void withdraw(int accountId, double amount)
            throws NotEnouthMoneyException, UnKnownAccountException;

    // баланс
    void balance(int accountId)
            throws UnKnownAccountException;

    //внести на счёт указанную сумму
    void deposit(int accountId, double amount)
            throws NotEnouthMoneyException, UnKnownAccountException;

    //перевести сумму с одного счёта на другой
    void transfer(int from, int to, double amount)
            throws NotEnouthMoneyException, UnKnownAccountException;
}
