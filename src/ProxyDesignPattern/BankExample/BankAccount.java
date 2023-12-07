package ProxyDesignPattern.BankExample;

// Subject interface
public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
