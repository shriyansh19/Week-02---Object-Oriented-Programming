import java.util.ArrayList;

// Represents a customer of the bank
class Customer {
    private String name; // Customer's name
    private ArrayList<Account> accounts; // List of accounts associated with the customer

    // Constructor to initialize the customer with a name
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Adds an account to the customer's account list
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Displays all accounts and their balances for the customer
    public void viewBalance() {
        System.out.println(name + "'s Accounts:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

// Represents a bank account
class Account {
    private String accountNumber; // Unique account number
    private double balance; // Account balance

    // Constructor to initialize the account with account number and balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for account balance
    public double getBalance() {
        return balance;
    }
}

// Represents a bank that holds customer accounts
class Bank {
    private String name; // Name of the bank
    private ArrayList<Customer> customers; // List of customers associated with the bank

    // Constructor to initialize the bank with a name
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Opens an account for a customer and associates it with the bank
    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account); // Add the account to the customer
        if (!customers.contains(customer)) {
            customers.add(customer); // Add the customer to the bank if not already present
        }
    }

    // Displays all customers and their accounts in the bank
    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            customer.viewBalance();
        }
    }
}

// Main class to demonstrate the association relationship
public class BankAssociationDemo {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Bank");

        // Create customers
        Customer customer1 = new Customer("Cristiano Ronaldo");
        Customer customer2 = new Customer("Roger Federrer");

        // Create accounts
        Account account1 = new Account("12345", 1000.0);
        Account account2 = new Account("67890", 2000.0);
        Account account3 = new Account("11223", 3000.0);

        // Open accounts for customers
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // Display all customers and their accounts
        bank.displayCustomers();
    }
}
