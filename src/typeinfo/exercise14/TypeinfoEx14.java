package typeinfo.exercise14;
import java.util.*;

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Class<? extends Part>> partFactories =
            new ArrayList<>();
    static {
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }
    private static Random rand = new Random(47);
    @SuppressWarnings("deprecation")
	public static Part createRandom() {
        Part part = null;
        int n = rand.nextInt(partFactories.size());
        try {
            part = partFactories.get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return part;
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    public FuelFilter() { super(); }
}

class AirFilter extends Filter {
   public AirFilter() { super(); }
}

class CabinAirFilter extends Filter {
  public CabinAirFilter() { super(); }
}

class OilFilter extends Filter {
    public OilFilter() { super(); }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public FanBelt() { super(); }
}

class GeneratorBelt extends Belt {
    public GeneratorBelt() { super(); }
}

class PowerSteeringBelt extends Belt {
    public PowerSteeringBelt() { super(); }
}

class RegisteredFactories {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());
    }
}

public class TypeinfoEx14 {
    public static void main(String[] args) {
        RegisteredFactories.main(args);
    }
}
