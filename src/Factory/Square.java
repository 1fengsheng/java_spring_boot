package Factory;

import Factory_interface.Shape;

public class Square implements Shape {
	public Square() {
		// TODO Auto-generated constructor stub
		System.out.println("����һ��������");
	}
    @Override
    public void draw() {
        System.out.println("��һ��������");
    }
}