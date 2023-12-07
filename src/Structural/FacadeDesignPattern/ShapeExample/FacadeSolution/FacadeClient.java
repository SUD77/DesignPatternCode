package Structural.FacadeDesignPattern.ShapeExample.FacadeSolution;


/*
*  Client wants Circle, Rectanlge and square shape, so
*  - he will have to create 3 objects and then call their implementations.
*  - This is too much work for client.
*
*
* */
public class FacadeClient {
    public static void main(String[] args) {

        ShapeMaker shapeMaker=new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
