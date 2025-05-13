package Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.ConcreteHandler;

import Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.Handler;

public class AdminCheckHandler extends Handler {
    @Override
    public void handle(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Admin login detected. Redirecting to admin dashboard.");
        } else {
            System.out.println("Login successful for regular user.");
        }
    }
}
