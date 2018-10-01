package typeinfo.exercise15;

public class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() { super(); }

    public static class Factory
            implements typeinfo.factory.Factory<Manx> {
        public Manx create() { return new Manx(); }
    }
}
