package innerclasses.exercise7;

class Outer {
	private int intNumber;
	private void displayIntNumber() {
		System.out.println("Int number = " + intNumber);
	}
	class Inner {
		public void setIntMember(int intNumber) {
			Outer.this.intNumber = intNumber;
			displayIntNumber();
		}
	}
	public void modifyIntMember(int newNumber) {
		Inner inner = new Inner();
		inner.setIntMember(newNumber);
	}
}

public class InnerClassesEx7 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.modifyIntMember(10);
		outer.modifyIntMember(15);
	}
}
