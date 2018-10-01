package typeinfo.exercise12;
import generics.coffee.*;
import net.mindview.util.TypeCounter;

public class TypeinfoEx12 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        CoffeeGenerator generator = new CoffeeGenerator(20);
        for(Coffee coffee : generator) {
            System.out.print(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        System.out.println();
        System.out.print(counter);
    }
}
