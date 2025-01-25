package bankingSystem;

// Subclass CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest

    // Constructor for CurrentAccount
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implementation of calculateInterest method
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implementation of applyForLoan method
    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account.");
    }

    // Implementation of calculateLoanEligibility method
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3; // Loan eligibility is three times the balance
    }
}
