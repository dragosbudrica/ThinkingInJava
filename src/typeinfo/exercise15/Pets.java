package typeinfo.exercise15;
import java.util.ArrayList;

public class Pets {
    public static final PetCreator creator =
            new PetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}