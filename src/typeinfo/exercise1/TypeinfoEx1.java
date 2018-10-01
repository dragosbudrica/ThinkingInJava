package typeinfo.exercise1;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    // Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}

class ToyTest {
    static void printInfo(@SuppressWarnings("rawtypes") Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }
    @SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.exercises.exercise1.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance(); // An InstantiationException occurs
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}


public class TypeinfoEx1 {
    public static void main(String[] args) {
        ToyTest.main(args);
    }
}
