package decoratorPattern;

public interface BankAccount {
    // BankAccount interface.
    String showAccountType();
    double getInterestRate();
    double getBalance();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}
