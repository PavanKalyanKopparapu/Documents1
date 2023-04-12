package Day5;

class Customer {
    int amount = 100000;
    String name;

    Customer(String name) {
        this.name = name;
    }

    synchronized void withdraw(int amount) {
        System.out.println("Customer: " + this.name + " going to withdraw amount..." + amount);
        if (this.amount < amount) {
            System.out.println("Customer: " + this.name + " Less balance; waiting for deposit balance : " + this.amount);
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("Customer: " + this.name + " withdraw completed balance : " + this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("Customer: " + this.name + " going to deposit amount..." + amount + " balance:" + this.amount);
        this.amount += amount;
        System.out.println("Customer: " + this.name + " deposit completed" + " balance:" + this.amount);
        notify();
    }
}

public class Bank {
    public static void main(String args[]) {
        final Customer c = new Customer("Sumit");

        final Customer c1 = new Customer("Umesh");
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(100000);
            }
        }.start();
        new Thread() {
            public void run() {
                c1.withdraw(14000);
            }
        }.start();
        new Thread() {
            public void run() {
                c1.deposit(15000);
            }
        }.start();

    }
}

