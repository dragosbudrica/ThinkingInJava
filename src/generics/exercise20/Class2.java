package generics.exercise20;

interface Interface {
    void method1();
    void method2();
}

class Class1 implements Interface {
    @Override
    public void method1() {
        System.out.println("method1");
    }
    @Override
    public void method2() {
        System.out.println("method2");
    }
    public void method3() {
        System.out.println("method3");
    }
}

public class Class2 {
    public static <T extends Interface> void method(T t) {
        t.method1();
        t.method2();
    }
    public static void main(String[] args) {
        method(new Class1());
    }
}
