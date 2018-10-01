package typeinfo.exercise21;

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() { System.out.println("doSomething"); }
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        long nanosBeforeMethodCall = System.nanoTime();
        proxied.doSomething();
        long nanosAfterMethodCall = System.nanoTime();
        long elapsedTime = nanosAfterMethodCall - nanosBeforeMethodCall;
        System.out.println("Time consuming for doSomething method: " + elapsedTime + " ns");
    }
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        long nanosBeforeMethodCall = System.nanoTime();
        proxied.somethingElse(arg);
        long nanosAfterMethodCall = System.nanoTime();
        long elapsedTime = nanosAfterMethodCall - nanosBeforeMethodCall;
        System.out.println("Time consuming for somethingElse method: " + elapsedTime + " ns");
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
public class TypeinfoEx21 {
    public static void main(String[] args) {
        SimpleProxyDemo.main(args);
    }
}
