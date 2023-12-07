package ProxyDesignPattern.BankExample;

public class ProxyBankAccount implements BankAccount{
    private RealBankAccount realAccount;
    private String userRole;

    public ProxyBankAccount(String userRole) {
        this.userRole = userRole;
    }

    private void checkAccess() {
        // Simulate access control logic based on user role
        if (!"admin".equalsIgnoreCase(userRole)) {
            throw new SecurityException("Access denied. Insufficient privileges.");
        }
    }

    @Override
    public void deposit(double amount) {
        checkAccess();
        if (realAccount == null) {
            realAccount = new RealBankAccount();
        }
        realAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        checkAccess();
        if (realAccount == null) {
            realAccount = new RealBankAccount();
        }
        realAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        checkAccess();
        if (realAccount == null) {
            realAccount = new RealBankAccount();
        }
        return realAccount.getBalance();
    }
}
