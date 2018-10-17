package generics.exercise25;

interface Interface1 {
    void method1();
}
interface Interface2 {
    void method2();
}

class Class implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}

public class Test {
    private static <T extends Interface1> void method1(T obj) {
        obj.method1();
    }
    private static <T extends Interface2> void method2(T obj) {
        obj.method2();
    }
    public static void main(String[] args) {
        Class cls = new Class();
        method1(cls);
        method2(cls);
    }
}
