package threads;

/**
 * Basic:
 * 1.static method can be synchronized
 * 
 * public static synchronized int getCount() {return count;}
 * is equal to following(suppose the  method is defined in a class called MyClass)
 * public static int getCount() {
 *  synchronized(MyClass.class) {
 *  return count;
 * }
 * 2.wait() will give up lock, notify(),join(),sleep(),yield() keep lock
 *
 */
public class AccountDanger implements Runnable{
    //The Runnable object holds a reference to a single account
    private Account account = new Account();

    public static void main(String[] args) {
        AccountDanger r = new AccountDanger();
        //each thread is given a reference to the same Runnable
        Thread one = new Thread(r, "Fred");
        Thread two = new Thread(r, "Lucy");
        one.start();
        two.start();
    }

    public void run() {
        for (int x=0; x<5; x++) {
            makeWithdrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    //should add synchronized key word
    private void makeWithdrawl(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                // no handle
            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " complete withdrawl");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName()
                    + " to withdraw " + account.getBalance());
        }
    }
}


