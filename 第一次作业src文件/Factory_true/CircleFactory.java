package Factory_true;

import Factory.Circle;
import Factory_interface.Factory;
import Factory_interface.Shape;

public class CircleFactory implements Factory {
	public CircleFactory() {
		System.out.println("������Բ��");
	}
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
