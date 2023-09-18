package Factory_true;

import Factory.Square;
import Factory_interface.Factory;
import Factory_interface.Shape;

public class SquareFactory implements Factory {
	public SquareFactory() {
		System.out.println("生产出正方形");
	}
    @Override
    public Shape createShape() {
        return new Square();
    }
}
