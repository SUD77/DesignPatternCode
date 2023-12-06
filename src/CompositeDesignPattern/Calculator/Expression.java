package CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression{


    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftPart,ArithmeticExpression rightPart, Operation operation){
        this.leftExpression=leftPart;
        this.rightExpression=rightPart;
        this.operation=operation;
    }


    @Override
    public int evalute() {

        int value=0;

        switch (operation){

            case ADD:
                value=leftExpression.evalute() + rightExpression.evalute();
                break;
            case SUBTRACT:
                value=leftExpression.evalute() - rightExpression.evalute();
                break;
            case MULTIPLY:
                value=leftExpression.evalute() * rightExpression.evalute();
                break;
            case DIVIDE:
                value=leftExpression.evalute() / rightExpression.evalute();
                break;
        }

        System.out.println("Expression value is: "+ value);
        return value;
    }
}
