package typeinfo.exercise15;

public class EgyptianMau extends Cat {
    public static class Factory
            implements typeinfo.factory.Factory<EgyptianMau> {
        public EgyptianMau create() { return new EgyptianMau(); }
    }
}
