package typeinfo.exercise9;

import java.lang.reflect.Field;

class Animal {
    protected String name;
    protected String color;
    protected int height;
    protected int width;
}

class Mammal extends Animal {
    protected int numberOfUdders;
}

class Dog extends Mammal {
    protected int numberOfFeet;
}

class Spaniel extends Dog {}

class Cocker extends Spaniel {}

public class TypeinfoEx9 {
    @SuppressWarnings("deprecation")
	private static void printInfo(Object object)  {
        System.out.println("Class name: " + object.getClass().getName());
        System.out.println("Simple name: " + object.getClass().getSimpleName());
        System.out.println("Canonical name: " + object.getClass().getCanonicalName());
        Field[] fields = object.getClass().getDeclaredFields();
        if(fields.length > 0) {
            System.out.println("Field(s):");
            for (Field field: fields) {
                System.out.println(field.getType() + " " + field.getName());
            }
        }
        System.out.println("=========================================================");
        if(object.getClass().getSuperclass() != null) {
            try {
                printInfo(object.getClass().getSuperclass().newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        printInfo(new Cocker());
    }
}