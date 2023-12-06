package decoratorPattern;

public class SavingsAccount implements BankAccount {
    private Integer accountNumber;
    private String accountName;
    private double balance;

    // Setter for accountNumber.
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Setter for accountName.
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Setter for balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /* For implementing. */
    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate());
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\nAccount name: " + accountName +
                "\nBalance: " + balance;
    }

}
