class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Error: Insufficient balance.");
            }
        } else {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "Vishnu Vijayan", 1000.0);
        
        myAccount.displayAccountInfo();
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(2000.0); 
        myAccount.displayAccountInfo();
    }
}