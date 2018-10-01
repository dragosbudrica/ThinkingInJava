package reusing.exercises;

class Test {
	void test(String test) {
		System.out.println(test);
	}
	
	Integer test(int number) {
		System.out.println(number);
		return number;
	}
	
	char test(char a) {
		System.out.println(a);
		return 'a';
	}
}

class OverloadingWithInheritance extends Test {
	String test(float floatNo) {
		System.out.println(floatNo);
		return String.valueOf(floatNo);
	}
}

public class ReusingEx13 {
	public static void main(String[] args) {
		OverloadingWithInheritance onh = new OverloadingWithInheritance();
		onh.test('a');
		onh.test(15.87f);
		onh.test("test");
		onh.test(5);
	}
}
