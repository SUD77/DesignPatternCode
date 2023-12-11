package Behavioural.StrategyDesignPattern.ArithmeticExample;

public class ArithmeticClient {
    public static void main(String[] args) {

        Context context=new Context();

        int first=6;
        int second=9;

        /*
         Read the desired action from user input.

        if (action == addition) then
            context.setStrategy(new ConcreteStrategyAdd())

        if (action == subtraction) then
            context.setStrategy(new ConcreteStrategySubtract())

        if (action == multiplication) then
            context.setStrategy(new ConcreteStrategyMultiply())

        result = context.executeStrategy(First number, Second number)

        Print result.

        * */

        // Change actions here - Add, Subtract, Multiply. This should be taken from user, but here
        // just to demonstrate the example, showing manually.
        String action="Add";

        if(action.equalsIgnoreCase("Add")){
            context.setStrategy(new ConcreteStrategyAdd());
        }

        if(action.equalsIgnoreCase("Subtract")){
            context.setStrategy(new ConcreteStrategySubtract());
        }

        if(action.equalsIgnoreCase("Multiply")){
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result=context.executeStrategy(first,second);

        System.out.println(result);




    }
}
