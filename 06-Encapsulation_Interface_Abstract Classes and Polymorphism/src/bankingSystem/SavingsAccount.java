package bankingSystem;

// Subclass SavingsAccount
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String holderName, double balance) {
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
        System.out.println("Loan application submitted for Savings Account.");
    }

    // Implementation of calculateLoanEligibility method
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is twice the balance
    }
}

