package typeinfo.exercise7;

class Candy {
    static { System.out.println("Loading Candy"); }
}

class Gum {
    static { System.out.println("Loading Gum"); }
}

class Cookie {
    static { System.out.println("Loading Cookie"); }
}

class SweetShop {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: sweetName");
        } else {
            for (String arg : args) {
                try {
                    Class.forName("typeinfo.exercises.exercise7." + arg);
                } catch (ClassNotFoundException e) {
                    System.out.println("Could't find " + arg);
                }
                System.out.println("After Class.forName(" + arg + ")");
            }
        }
    }
}

public class TypeinfoEx7 {
    public static void main(String[] args) {
        SweetShop.main(args);
    }
}