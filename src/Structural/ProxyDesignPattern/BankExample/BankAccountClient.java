package Structural.ProxyDesignPattern.BankExample;

/*

Protection Proxy Example

More about this example :

In this example, the ProxyBankAccount acts as a proxy for the RealBankAccount based on the user's role.
The proxy checks the user's role before allowing operations
such as deposit, withdrawal, or checking the balance.
If the user does not have sufficient privileges (e.g., not an admin),
a SecurityException is thrown, demonstrating access control through the proxy.

This is a protection proxy scenario,
where the proxy controls access to the real object based on certain conditions.


* */


// Client code using the Proxy
public class BankAccountClient {
    public static void main(String[] args) {

        // Creating a proxy for a regular user
        BankAccount regularUserAccount = new ProxyBankAccount("user");

        // Attempting to deposit (should throw SecurityException)
        try {
            regularUserAccount.deposit(1000);
        } catch (SecurityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Creating a proxy for an admin user
        BankAccount adminUserAccount = new ProxyBankAccount("admin");

        // Performing operations with admin privileges
        adminUserAccount.deposit(1000);
        adminUserAccount.withdraw(500);
        System.out.println("Balance: $" + adminUserAccount.getBalance());

    }
}
