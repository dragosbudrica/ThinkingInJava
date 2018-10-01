package interfaces.exercise15;

interface InterfaceNumber1 {
	void method1();
	void method2();
}

interface InterfaceNumber2 {
	void method3();
	void method4();
}

interface InterfaceNumber3 {
	void method5();
	void method6();
}

interface InterfaceNumber4 extends InterfaceNumber1, InterfaceNumber2,
									InterfaceNumber3 {
	void method7();
}

abstract class Class1 {
	public abstract void method8();
}

class Class2 extends Class1 implements InterfaceNumber4  {
	
	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	@Override
	public void method3() {
		System.out.println("method3");
	}

	@Override
	public void method4() {
		System.out.println("method4");
	}

	@Override
	public void method5() {
		System.out.println("method5");
	}

	@Override
	public void method6() {
		System.out.println("method6");
	}

	@Override
	public void method7() {
		System.out.println("method7");
	}

	@Override
	public void method8() {
		System.out.println("method8");
	}
}

public class InterfacesEx15 {
	static void staticMethod1(InterfaceNumber1 in1) { 
		in1.method1(); 
		in1.method2();
	}
	static void staticMethod2(InterfaceNumber2 in2) { 
		in2.method3(); 
		in2.method4();
	}
	static void staticMethod3(InterfaceNumber3 in3) { 
		in3.method5(); 
		in3.method6();
	}
	static void staticMethod4(InterfaceNumber4 in4) { 
		in4.method1();
		in4.method2();
		in4.method3();
		in4.method4();
		in4.method5();
		in4.method6();
		in4.method7();
	}
	
	public static void main(String[] args) {
		Class2 class2 = new Class2();
		staticMethod1(class2);
		System.out.println("--------------------------");
		staticMethod2(class2);
		System.out.println("--------------------------");
		staticMethod3(class2);
		System.out.println("--------------------------");
		staticMethod4(class2);
	}
}

