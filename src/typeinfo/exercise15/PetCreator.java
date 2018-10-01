package typeinfo.exercise15;
import typeinfo.factory.Factory;
import java.util.*;

public class PetCreator {
    public String toString() {
        return getClass().getSimpleName();
    }

    public static List<Factory<? extends Pet>> petFactories
            = new ArrayList<>();

    static {
        petFactories.add(new Mutt.Factory());
        petFactories.add(new Pug.Factory());
        petFactories.add(new EgyptianMau.Factory());
        petFactories.add(new Manx.Factory());
        petFactories.add(new Cymric.Factory());
        petFactories.add(new Rat.Factory());
        petFactories.add(new Mouse.Factory());
        petFactories.add(new Hamster.Factory());
    }

    private static Random rand = new Random(47);

    public Pet randomPet() {
        int n = rand.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
