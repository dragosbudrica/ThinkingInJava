package typeinfo.exercise16;

public class Americano extends Coffee {
    public static class Factory
            implements typeinfo.factory.Factory<Americano> {
        public Americano create() { return new Americano(); }
    }
}
