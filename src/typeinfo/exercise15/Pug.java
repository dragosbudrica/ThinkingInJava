package typeinfo.exercise15;

public class Pug extends Dog {
    public Pug(String name) { super(name); }
    public Pug() { super(); }

    public static class Factory
            implements typeinfo.factory.Factory<Pug> {
        public Pug create() { return new Pug(); }
    }
}
