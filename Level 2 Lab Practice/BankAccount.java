class BankAccount {
    String accountHolder; // Attribute to store account holder's name
    int accountNumber;    // Attribute to store account number
    double balance;       // Attribute to store account balance

    // Constructor to initialize bank account attributes
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create a bank account object
        BankAccount account = new BankAccount("John Doe", 12345678, 5000.0);

        // Perform transactions
        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(6000); // Should display insufficient balance
        account.displayBalance();
    }
}
