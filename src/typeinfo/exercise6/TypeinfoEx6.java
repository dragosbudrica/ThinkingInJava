package typeinfo.exercise6;
import java.util.*;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
    boolean flag;
}

class Circle extends Shape {
    public String toString() { return (flag ? "H" : "Unh") + "ighlighted Circle"; }
}

class Square extends Shape {
    public String toString() { return (flag ? "H" : "Unh") + "ighlighted Square"; }
}

class Triangle extends Shape {
    public String toString() { return (flag ? "H" : "Unh") + "ighlighted Triangle"; }
}

class Shapes {
    private static void setFlag(Shape shape) {
        shape.flag = !(shape instanceof Circle);
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape: shapeList) {
            setFlag(shape);
            shape.draw();
        }
    }
}
public class TypeinfoEx6 {
    public static void main(String[] args) {
        Shapes.main(args);
    }
}
