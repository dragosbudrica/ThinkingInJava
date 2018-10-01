package exceptions.exercises;

@SuppressWarnings("serial")
class MyNewException1 extends Exception {
}

@SuppressWarnings("serial")
class MyNewException2 extends MyNewException1 {
}

@SuppressWarnings("serial")
class MyNewException3 extends MyNewException2 {
}

class A {
	void method() throws MyNewException1 {
		System.out.println("Method from class A");
		throw new MyNewException1();
	}
}

class B extends A {
	void method() throws MyNewException2 {
		System.out.println("Method from class B");
		throw new MyNewException2();
	}
}

class C extends B {
	void method() throws MyNewException3 {
		System.out.println("Method from class C");
		throw new MyNewException3();
	}
}

public class ExceptionsEx25 {
	public static void main(String[] args) {
		A c = new C();
		try {
			c.method();
		} catch (MyNewException3 e) {
			e.printStackTrace(System.out);
		} catch (MyNewException2 e) {
			e.printStackTrace(System.out);
		} catch (MyNewException1 e) {
			e.printStackTrace(System.out);
		}
	}
}
