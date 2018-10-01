package typeinfo.exercise15;

public class Mutt extends Dog {
    public Mutt(String name) { super(name); }
    public Mutt() { super(); }
    public static class Factory
            implements typeinfo.factory.Factory<Mutt> {
        public Mutt create() { return new Mutt(); }
    }
}
