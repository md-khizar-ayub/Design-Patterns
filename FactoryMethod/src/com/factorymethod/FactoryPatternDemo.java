package com.factorymethod;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();

		// Rectangle
		Shape rectangle = sf.getShape("Rectangle");
		if (rectangle != null)
			rectangle.draw();
		// Square
		Shape square = sf.getShape("Square");
		if (square != null)
			square.draw();
		// Circle
		Shape circle = sf.getShape("Circle");
		if (circle != null)
			circle.draw();
		// Circle
		Shape wrong = sf.getShape("");
		if (wrong != null)
			wrong.draw();
		else 
			System.out.println("Wrong name :(");
	}
}
