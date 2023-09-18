package Factory;

import Factory_interface.Shape;

public class Rectangle implements Shape {
	public Rectangle() {
		// TODO Auto-generated constructor stub
		System.out.println("创建一个矩形");
	}
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}