package typeinfo.exercise15;

public class Mouse extends Rodent {
    public static class Factory
            implements typeinfo.factory.Factory<Mouse> {
        public Mouse create() { return new Mouse(); }
    }
}
