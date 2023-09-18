package Factory;

import Factory_interface.Shape;

public class Square implements Shape {
	public Square() {
		// TODO Auto-generated constructor stub
		System.out.println("创建一个正方形");
	}
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}