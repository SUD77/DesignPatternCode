package Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample;

import Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.ConcreteHandler.AdminCheckHandler;
import Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.ConcreteHandler.EmailFormatHandler;
import Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.ConcreteHandler.PasswordLengthHandler;
import Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.Handler;

public class AuthenticationClient {
    public static void main(String[] args) {
        Handler chain = new EmailFormatHandler();
        chain.setNext(new PasswordLengthHandler())
                .setNext(new AdminCheckHandler());

        System.out.println("Test Case 1: Invalid Email");
        chain.handle("invalidEmail", "password123");

        System.out.println("\nTest Case 2: Short Password");
        chain.handle("user@example.com", "123");

        System.out.println("\nTest Case 3: Admin Login");
        chain.handle("admin@example.com", "securePass");

        System.out.println("\nTest Case 4: Regular User Login");
        chain.handle("user@example.com", "securePass");
    }
}
