package generics.exercise28;
import java.util.*;
import typeinfo.pets.*;

class Generic1<T> {
     void write(T item) {
        System.out.println(item);
    }
}

class Generic2<T> {
     T read() {
        return null;
    }
}

public class Test{
    static <T> void met1(Generic1<? super T> gen, T pet) {
        gen.write(pet);
    }
    static <T> T met2(Generic2<? extends T> gen) {
        return gen.read();
    }
    public static void main(String[] args) {
        Generic1<Dog> gen1 = new Generic1<Dog>();
        met1(gen1, new Dog());
        // met1(gen1, new EgyptianMau());  EgyptianMau is not Dog
        Generic2<Dog> gen2 = new Generic2<Dog>();
        Dog dog = met2(gen2);
        // EgyptianMau egyptianMau = met2(gen2); EgyptianMau is not Dog
        Pet pet = met2(gen2);
    }
}
