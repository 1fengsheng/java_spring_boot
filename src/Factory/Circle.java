package Factory;

import Factory_interface.Shape;

public class Circle implements Shape {
	public Circle(){
		System.out.println("������һ��Բ��");
	}
    @Override
    public void draw() {
        System.out.println("��һ��Բ��");
    }
}
