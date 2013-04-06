package threads;

public class Account {
    private int balance = 50;

    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int amout) {
        this.balance = this.balance - amout;
    }
}
