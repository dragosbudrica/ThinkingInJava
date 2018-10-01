package reusing.exercises;

class WithFinals { 
	protected void f() { System.out.println("WithFinals.f()"); }
	protected void g() { System.out.println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
	@Override
	protected void f() {
		System.out.println("OverridingPrivate.f()");
	}
	@Override
	protected void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	@Override
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	@Override
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
		 op.f();
		 op.g();
		WithFinals wf = op2;
		 wf.f();
		 wf.g();
	}
}

public class ReusingEx20 {
	public static void main(String[] args) {
		FinalOverridingIllusion.main(args);
	}
}

