package typeinfo.exercise8;

class Animal {}

class Mammal extends Animal {}

class Dog extends Mammal {}

class Spaniel extends Dog {}

class Cocker extends Spaniel {}

public class TypeinfoEx8 {
    @SuppressWarnings("deprecation")
	private static void printInfo(Object object)  {
        System.out.println("Class name: " + object.getClass().getName());
        System.out.println("Simple name: " + object.getClass().getSimpleName());
        System.out.println("Canonical name: " + object.getClass().getCanonicalName());
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
