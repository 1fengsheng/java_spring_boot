package Factory;

import Factory_interface.Shape;

public class Rectangle implements Shape {
	public Rectangle() {
		// TODO Auto-generated constructor stub
		System.out.println("����һ������");
	}
    @Override
    public void draw() {
        System.out.println("��һ������");
    }
}