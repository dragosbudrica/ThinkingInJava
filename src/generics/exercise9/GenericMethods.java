package generics.exercise9;

public class GenericMethods {
	public <X, Y, Z> void f(X x, Y y, Z z) {
		System.out.println(x.getClass().getName() + " " + y.getClass().getName() + " " + 
				z.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("", 1, 1.0);
		gm.f(1, 1.0, 1.0F);
		gm.f(1.0, 1.0F, 'c');
		gm.f(1.0F, 'c', gm);
	}
}