abstract class BankAccount {
    public abstract void getBalance();
    public abstract void deposite();
    public abstract void withdraw();

    public void getDetails() {
        System.out.println("Name, Mobile no, Aadhar card, and etc");
    }
}

class SavingAccount extends BankAccount {
    public void deposite() {
        System.out.println("10000 deposit");
    }

    public void withdraw() {
        System.out.println("5000 withdraw");
    }

    public void getBalance() {
        System.out.println("5000 balance");
    }
}

class CurrentAccount extends BankAccount {
    public void deposite() {
        System.out.println("100000 deposit");
    }

    public void withdraw() {
        System.out.println("50000 withdraw");
    }

    public void getBalance() {
        System.out.println("50000 balance");
    }
}

public class Main {
    public static void main(String args[]) {
        CurrentAccount c = new CurrentAccount();
        System.out.println("Current Account Details");
        c.getDetails();
        c.deposite();
        c.withdraw();
        c.getBalance();

        SavingAccount s = new SavingAccount();
        System.out.println("Saving Account Details");
        s.getDetails();
        s.deposite();
        s.withdraw();
        s.getBalance();
    }
}
