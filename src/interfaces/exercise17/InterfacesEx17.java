package interfaces.exercise17;

interface Interface {
	int FIRST_FIELD = 10;
	double SECOND_FIELD = 11.5d;
	float THIRD_FIELD = 0.57f;
}

public class InterfacesEx17 {
	public static void main(String[] args) {
		System.out.println(Interface.FIRST_FIELD);
		System.out.println(Interface.SECOND_FIELD);
		System.out.println(Interface.THIRD_FIELD);
	//	Interface.FIRST_FIELD++; // The final field Interface.FIRST_FIELD cannot be assigned
	//	Interface.SECOND_FIELD--; // The final field Interface.SECOND_FIELD cannot be assigned
	//	Interface.THIRD_FIELD = 15.2f; // The final field Interface.THIRD_FIELD cannot be assigned
	}
}
