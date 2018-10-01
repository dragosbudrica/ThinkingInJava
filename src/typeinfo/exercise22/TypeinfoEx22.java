package typeinfo.exercise22;
import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println(" " + arg);
        long nanosBeforeMethodCall = System.nanoTime();
        Object invokation = method.invoke(proxied, args);
        long nanosAfterMethodCall = System.nanoTime();
        long elapsedTime = nanosAfterMethodCall - nanosBeforeMethodCall;
        System.out.println("Time consuming for " + method.getName() + " method: " + elapsedTime + " ns");
        return invokation;
    }
}

class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
public class TypeinfoEx22 {
    public static void main(String[] args) {
        SimpleDynamicProxy.main(args);
    }
}
