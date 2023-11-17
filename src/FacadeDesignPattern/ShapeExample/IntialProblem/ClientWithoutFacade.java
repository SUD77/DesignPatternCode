package FacadeDesignPattern.ShapeExample.IntialProblem;


/*
*  Client wants Circle, Rectanlge and square shape, so
*  - he will have to create 3 objects and then call their implementations.
*  - This is too much work for client.
*
*
* */
public class ClientWithoutFacade {
    public static void main(String[] args) {

        Circle circle=new Circle();
        Square square=new Square();
        Rectangle rectangle=new Rectangle();

        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
