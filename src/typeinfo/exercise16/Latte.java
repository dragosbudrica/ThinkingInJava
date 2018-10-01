package typeinfo.exercise16;

public class Latte extends Coffee {
    public static class Factory
            implements typeinfo.factory.Factory<Latte> {
        public Latte create() { return new Latte(); }
    }
}
