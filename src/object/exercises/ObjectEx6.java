package object.exercises;

public class ObjectEx6 {
	int storage(String s) {
		return s.length() * 2; 
	}
	
	public static void main(String[] args) {
		ObjectEx6 useOfTheStorageMethod = new ObjectEx6();
		int numberOfBytesInDragosString = useOfTheStorageMethod.storage("Dragos");
		System.out.println("The String \"Dragos\" has " + numberOfBytesInDragosString + " bytes");
	}
}
