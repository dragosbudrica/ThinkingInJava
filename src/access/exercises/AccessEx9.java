package access.exercises;

public class AccessEx9 {
	public static void main(String[] args) {
		System.out.println("The compiler generates an error trying to create an instance of access.local.PackagedClass in the access.foreign.Foreign class, because the class PackagedClass has the package-access modifier and it's accessed outside its package.");
		System.out.println("If the Foreign class would be part of the access.local package, then the compiler will no longer generates an error since both classes resides in the same package.");
	}
}
