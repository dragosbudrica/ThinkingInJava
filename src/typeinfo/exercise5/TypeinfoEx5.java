package typeinfo.exercise5;
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

class Shapes {
    private static void rotate(Shape shape) {
        if(!(shape instanceof Circle)) {
            System.out.println(shape + " is rotating!");
        }
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape: shapeList) {
            shape.draw();
            rotate(shape);
        }
    }
}
public class TypeinfoEx5 {
    public static void main(String[] args) {
        Shapes.main(args);
    }
}
