package ProxyDesignPattern.BankExample;

// Proxy: Controls access to the RealSubject based on user role
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

        /*I have added hashcode below, to check if same instance is formed, while calling
        these funtions, i.e deposit, withdraw and getBalance from client side
        */

//        System.out.println("Instance no in case of Deposit :" + realAccount.hashCode());
    }

    @Override
    public void withdraw(double amount) {
        checkAccess();
        if (realAccount == null) {
            realAccount = new RealBankAccount();
        }
        realAccount.withdraw(amount);
//        System.out.println("Instance no in case of Deposit :" + realAccount.hashCode());
    }

    @Override
    public double getBalance() {
        checkAccess();
        if (realAccount == null) {
            realAccount = new RealBankAccount();
        }
//        System.out.println("Instance no in case of Deposit :" + realAccount.hashCode());
        return realAccount.getBalance();
    }
}
