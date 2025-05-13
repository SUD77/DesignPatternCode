package Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.ConcreteHandler;

import Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.Handler;

public class PasswordLengthHandler extends Handler {
    @Override
    public void handle(String email, String password) {
        if (password.length() < 6) {
            System.out.println("Password too short.");
            return;
        }
        if (next != null) next.handle(email, password);
    }
}
