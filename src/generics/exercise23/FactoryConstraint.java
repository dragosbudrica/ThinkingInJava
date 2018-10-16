package generics.exercise23;

interface FactoryI<T> {
    T create(int no);
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create(1);
    }
}

class IntegerFactory implements FactoryI<Integer> {
    public Integer create(int no) {
        return new Integer(no);
    }
}

class Widget {
    private final int no;
    Widget(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Widget " + no;
    }

    public static class Factory implements FactoryI<Widget> {
        public Widget create(int no) {
            return new Widget(no);
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}