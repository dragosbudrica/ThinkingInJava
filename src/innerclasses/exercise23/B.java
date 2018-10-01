package innerclasses.exercise23;

public class B {
	private int length = 10;
	private U[] array = new U[length];

	public void addElement(U u) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = u;
				break;
			}
		}
	}

	public void setElemenToNull(int pos) {
		if (pos >= 0 && pos < length) {
			if(array[pos] == null) {
				System.out.println("The element in that position is already null!");
			}
			else {
			array[pos] = null;
			System.out.println("The element in the position " + pos + " has been set to null!");
			}
		}
		else {
			System.out.println("Invalid position!");
		}
	}

	public void move() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println("\nElement " + i + "\n------------------");
				array[i].method1();
				array[i].method2();
				array[i].method3();
				System.out.println();
			}
		}
	}

}
