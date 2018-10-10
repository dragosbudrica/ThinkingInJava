package generics.exercise18;
import java.util.*;
import generics.Generators;
import net.mindview.util.*;

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish() {}
    public String toString() { return "LittleFish " + id; }
    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            public LittleFish next() { return new LittleFish(); }
        };
    }
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    private BigFish() {}
    public String toString() { return "BigFish " + id; }
    public static Generator<BigFish> generator =
            new Generator<BigFish>() {
                public BigFish next() { return new BigFish(); }
            };
}

public class Ocean {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eats " + lf);
    }
    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<LittleFish> littleFishes = new LinkedList<LittleFish>();
        Generators.fill(littleFishes, LittleFish.generator(), 15);
        List<BigFish> bigFishes = new ArrayList<BigFish>();
        Generators.fill(bigFishes, BigFish.generator, 4);
        for(LittleFish lf : littleFishes)
            eat(bigFishes.get(rand.nextInt(bigFishes.size())), lf);
    }
}
