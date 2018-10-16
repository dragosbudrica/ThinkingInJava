package generics.exercise24;
import java.util.*;

class Building {}
class House extends Building {}

class BuildingFactory implements FactoryI<Building> {
    @Override
    public Building create() {
        return new Building();
    }
}

class HouseFactory extends Building implements FactoryI<House> {
    @Override
    public House create() {
        return new House();
    }
}

public class ClassTypeCapture {
    private Map<String, FactoryI<?>> typenameAndFactory;
    public ClassTypeCapture() {
        this.typenameAndFactory = new HashMap<>();
    }

    public void addFactory(String typename, FactoryI<?> kind) {
        typenameAndFactory.put(typename, kind);
    }

    public Object createNew(String typename) {
        FactoryI<?> fac = typenameAndFactory.get(typename);
        if(fac != null) {
            return fac.create();
        } else {
            System.out.println("Not a registered factoryName: " + typename);
            return null;
        }
    }
    public static void main(String[] args) {
        ClassTypeCapture ctt =
                new ClassTypeCapture();
        String str1 = Building.class.getSimpleName(),
                str2 = House.class.getSimpleName(),
                str3 = Product.class.getSimpleName(),
                str4 = String.class.getSimpleName();        ;
        ctt.addFactory(str1, new BuildingFactory());
        ctt.addFactory(str2, new HouseFactory());
        System.out.println(ctt.createNew(str1).getClass());
        System.out.println(ctt.createNew(str2).getClass());
        ctt.createNew(str3);
        ctt.createNew(str4);
    }
}
