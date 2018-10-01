package typeinfo.exercise19;
import java.lang.reflect.*;

public class TypeinfoEx19 {
    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("typeinfo.toys.Toy");
            Constructor constructor = c.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);
            constructor.newInstance(5);
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
