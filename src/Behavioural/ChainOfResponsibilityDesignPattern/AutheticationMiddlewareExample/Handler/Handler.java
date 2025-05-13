package Behavioural.ChainOfResponsibilityDesignPattern.AutheticationMiddlewareExample.Handler;

public abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler nextHandler) {
        this.next = nextHandler;
        return nextHandler;
    }

    public abstract void handle(String email, String password);
}
