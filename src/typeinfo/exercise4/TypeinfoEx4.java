package typeinfo.exercise4;
import java.util.*;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for(Shape shape: shapeList) {
            if(shape instanceof Circle) {
                shape.draw();
            } else if(shape instanceof Square) {
                shape.draw();
            } else if(shape instanceof Triangle) {
                shape.draw();
            } else if(shape instanceof Rhomboid) {
                shape.draw();
            }
        }

        Shape rhomboid = new Rhomboid(); // Implicit upcasting
        rhomboid.draw();

        Rhomboid rhomo = ((Rhomboid)rhomboid); // Explicit downcasting
        if(rhomo instanceof Rhomboid) {
            rhomboid.draw();
        }

     /*   Circle circle = (Circle)rhomboid; A ClassCastException occurs
        if(circle instanceof Rhomboid) {
            rhomboid.draw();  Inconvertible types
        }
        circle.draw();*/
    }
}
public class TypeinfoEx4 {
    public static void main(String[] args) {
        Shapes.main(args);

    }
}

