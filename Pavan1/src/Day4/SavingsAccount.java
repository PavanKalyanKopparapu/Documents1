package Day4;
class Bank{

    int total = 100;

    void withdrawn(String name, int withdrawal)
    {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn " + withdrawal);

            total = total - withdrawal;
            System.out.println("Balance after withdrawal: " + total);
            try {
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println(name + " you can not withdraw " + withdrawal);

            System.out.println("your balance is: " + total);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void deposit(String name, int deposit)
    {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                + total);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SavingsAccount {
    public static void main(String[] args)
    {
        Thread pool = Thread.currentThread();

        Bank obj = new Bank();

        obj.withdrawn("Pavan", 20);
        obj.withdrawn("Sammer", 40);
        obj.deposit("Neerali", 35);
        obj.withdrawn("Yash", 80);
        obj.withdrawn("SathishSir", 40);
    }
}
