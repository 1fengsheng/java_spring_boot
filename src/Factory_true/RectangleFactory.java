package Factory_true;

import Factory.Rectangle;
import Factory_interface.Factory;
import Factory_interface.Shape;

public class RectangleFactory implements Factory {
	public RectangleFactory() {
		System.out.println("生产出矩形");
	}
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
