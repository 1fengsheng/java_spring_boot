package Factory;

import Factory_interface.Shape;

public class Circle implements Shape {
	public Circle(){
		System.out.println("创建出一个圆形");
	}
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
