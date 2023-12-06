package decoratorPattern;

public interface BankAccountDecorator extends BankAccount {
    // BankAccountDecorator interface.
    void setBankAccount(BankAccount bankAccount);
}
