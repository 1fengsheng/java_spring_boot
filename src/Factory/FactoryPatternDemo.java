package Factory;


import Factory_interface.Factory;
import Factory_interface.Shape;
import Factory_true.CircleFactory;
import Factory_true.RectangleFactory;
import Factory_true.SquareFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        Shape circle = (Shape) circleFactory.createShape();
        ((Factory_interface.Shape) circle).draw();

        Factory rectangleFactory = new RectangleFactory();
        Shape rectangle = (Shape) rectangleFactory.createShape();
        ((Factory_interface.Shape) rectangle).draw();

        Factory squareFactory = new SquareFactory();
        Shape square = (Shape) squareFactory.createShape();
        ((Factory_interface.Shape) square).draw();
    }
}
