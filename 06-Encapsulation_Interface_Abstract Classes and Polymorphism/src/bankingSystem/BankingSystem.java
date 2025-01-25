package bankingSystem;

// Main class
public class BankingSystem {
    // Method to process different account types and calculate interest
    public static void processAccounts(BankAccount[] accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            // Check if the account is loanable
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan();
                double loanEligibility = loanableAccount.calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + loanEligibility);
            }

            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create instances of SavingsAccount and CurrentAccount
        BankAccount[] accounts = {
                new SavingsAccount("SA123", "Alice", 5000),
                new CurrentAccount("CA456", "Bob", 10000)
        };

        // Process the accounts
        processAccounts(accounts);
    }
}
