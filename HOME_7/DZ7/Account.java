package DZ7;

public class Account {
    int id;
    String Holder;
    Double Amount;

    public Account(int id, String holder, Double amount) {
        this.id = id;
        Holder = holder;
        Amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String toString() {
        return "Account{" + " id = " + id + " Holder = " + Holder + " Amount = " + Amount + " }";
    }
}
