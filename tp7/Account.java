
package tp7;

public abstract class Account {
    private String number;
    private String name;
    private int balance;

    public Account(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public abstract void openAccount();
}

