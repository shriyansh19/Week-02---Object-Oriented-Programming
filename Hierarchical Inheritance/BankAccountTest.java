// Base Class: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountType() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Test the Bank Account System
public class BankAccountTest {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("CHK123", 1500.0, 1000.0);
        checking.displayAccountType();
    }
}
