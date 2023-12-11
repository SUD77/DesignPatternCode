package Behavioural.StrategyDesignPattern.ArithmeticExample;

// Concrete strategies implement the algorithm while following
// the base strategy interface. The interface makes them
// interchangeable in the context.
public class ConcreteStrategyAdd implements Strategy{

    @Override
    public int execute(int a, int b) {
        return a+b;
    }
}
