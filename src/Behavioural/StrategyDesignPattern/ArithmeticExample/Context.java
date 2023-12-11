package Behavioural.StrategyDesignPattern.ArithmeticExample;

// The context defines the interface of interest to clients.
public class Context {

    // The context maintains a reference to one of the strategy
    // objects. The context doesn't know the concrete class of a
    // strategy. It should work with all strategies via the
    // strategy interface.
    private Strategy strategy;

    // Usually the context accepts a strategy through the
    // constructor, and also provides a setter so that the
    // strategy can be switched at runtime.
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // The context delegates some work to the strategy object
    // instead of implementing multiple versions of the
    // algorithm on its own.
    public int executeStrategy(int a,int b){
        return strategy.execute(a,b);
    }


}
