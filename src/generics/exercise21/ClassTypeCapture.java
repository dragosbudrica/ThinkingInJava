package generics.exercise21;
import java.util.*;

class Building {}
class House extends Building {}

public class ClassTypeCapture {
    private Map<String,Class<?>> typenameAndKind;
    public ClassTypeCapture() {
        this.typenameAndKind = new HashMap<>();
    }
    public boolean f(Object arg) {
        for (Map.Entry<String, Class<?>> entry : typenameAndKind.entrySet()) {
            if(entry.getValue().isInstance(arg)) {
                return true;
            }
        }
        return false;
    }
    public void addType(String typename, Class<?> kind) {
        typenameAndKind.put(typename, kind);
    }

    @SuppressWarnings("unchecked")
    public Object createNew(String typename) {
        Class<?> cl = typenameAndKind.get(typename);
        try {
            return cl.newInstance();
        } catch(NullPointerException e1) {
            System.out.println("Not a registered typename: " + typename);
        } catch (InstantiationException | IllegalAccessException e2) {
            System.out.println(e2.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        ClassTypeCapture ctt =
                new ClassTypeCapture();
        String str1 = Building.class.getSimpleName(),
               str2 = House.class.getSimpleName(),
               str3 = Product.class.getSimpleName();
        ctt.addType(str1, Building.class);
        ctt.addType(str2, House.class);
        ctt.addType(str3, Product.class);
        System.out.println(ctt.createNew(str1).getClass());
        System.out.println(ctt.createNew(str2).getClass());
        ctt.createNew("Product");
        ctt.createNew("String");
    }
}