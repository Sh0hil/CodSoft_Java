import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Khan's ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: checkBalance();
                case 2: deposit();
                case 3: withdraw();
                case 4: exit = true; break;
                default: System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Thank you for using the ATM. Goodbye!");
    }

    private void checkBalance() {
        System.out.println("Current balance: Rs" + account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter Deposit amount: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter Withdrawal amount: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000.0); // initial balance
        ATM atm = new ATM(account);
        atm.showMenu();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: Rs" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Current balance: Rs" + balance);
            System.out.println("Collect your Cash!");
        } else {
            System.out.println(" Invalid amount. Withdrawal unsuccessful.");
        }
    }
}
