package interfaces.exercise3;

abstract class InterfacesEx3Base {
	InterfacesEx3Base() {
		print();
	}
	public abstract void print();
}

class InterfacesEx3Derived extends InterfacesEx3Base {
	private int value = 3;
	@Override
	public void print() {
		System.out.println("Value = " + value);
	}
	
}

public class InterfacesEx3 {
	public static void main(String[] args) {
		InterfacesEx3Base ie3 = new InterfacesEx3Derived(); // Value = 0 because the InterfaceEx3Derived wasn't loaded in this stage, so the value its data member is automatically initialized with value 0(for numbers).
		ie3.print();  // Value = 1 because the InterfacesEx3Derived was loaded and its member was initialized with value 3.
	}
}
