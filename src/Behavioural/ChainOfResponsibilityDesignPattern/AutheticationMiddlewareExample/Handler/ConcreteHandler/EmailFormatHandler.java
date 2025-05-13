package Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.ConcreteHandler;

import Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler.Handler;

public class EmailFormatHandler extends Handler {
    @Override
    public void handle(String email, String password) {
        if (!email.contains("@")) {
            System.out.println("Invalid email format.");
            return;
        }
        if (next != null) next.handle(email, password);
    }
}
