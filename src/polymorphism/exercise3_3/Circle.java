package polymorphism.exercise3_3;

public class Circle extends Shape {
	@Override
	public void draw() { System.out.println("Circle.draw()"); }
	@Override
	public void erase() { System.out.println("Circle.erase()"); }
	@Override
	public void printMessage() { System.out.println("Hello, Circle!"); }
} 
