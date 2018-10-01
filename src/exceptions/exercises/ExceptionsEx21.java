package exceptions.exercises;

@SuppressWarnings("serial")
class PersonalExp1 extends Exception {}
@SuppressWarnings("serial")
class PersonalExp2 extends Exception {}

class MyNewClass { 
	MyNewClass() throws PersonalExp1, PersonalExp2 {
		throw new PersonalExp1();
	}
}

public class ExceptionsEx21 extends MyNewClass {
	ExceptionsEx21() throws PersonalExp1, PersonalExp2 {}
/*	 ExceptionsEx21() {
		try {
			super(); // Constructor call must be the first statement in a constructor
		} catch(PersonalExp1 e) {
			e.printStackTrace(System.out);
		} 
	} */
	public static void main(String[] args) {
		try {
			new ExceptionsEx21();
		} catch (PersonalExp1 e) {
			e.printStackTrace(System.out);
		} catch (PersonalExp2 e) {
			e.printStackTrace(System.out);
		}
	}
}
