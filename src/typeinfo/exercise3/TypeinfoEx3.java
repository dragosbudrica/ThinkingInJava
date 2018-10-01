package typeinfo.exercise3;

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

class Shapes {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList)
            shape.draw();

        Shape rhomboid = new Rhomboid(); // Implicit upcasting
        rhomboid.draw();

        Rhomboid rhomo = ((Rhomboid) rhomboid); // Explicit downcasting
        rhomboid.draw();

        Circle circle = (Circle) rhomboid;
        circle.draw(); // A ClassCastException occurs
    }
}

public class TypeinfoEx3 {
    public static void main(String[] args) {
        Shapes.main(args);

    }
}
