package generics.exercise10;

public class GenericMethods {
	public <X, Y> void f(X x, Y y, Object a) {
		System.out.println(x.getClass().getName() + " " + y.getClass().getName() + " " + 
				a.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("", 1, 1.0);
		gm.f(1, 1.0, 1.0F);
		gm.f(1.0, 1.0F, 'c');
		gm.f(1.0F, 'c', gm);
	}
}
