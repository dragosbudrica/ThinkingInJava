package innerclasses.exercise12;

interface Setter {
	void setIntMember(int intNumber);
}

class Outer {
	private int intNumber;
	private void displayIntNumber() {
		System.out.println("Int number = " + intNumber);
	}
	public void modifyIntMember(int newNumber) {
		new Setter() {
			@Override
			public void setIntMember(int intNumber) {
				Outer.this.intNumber = intNumber;
				displayIntNumber();
			}
		}.setIntMember(newNumber);
	}
}

public class InnerClassesEx12 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.modifyIntMember(10);
		outer.modifyIntMember(15);
	}
}
