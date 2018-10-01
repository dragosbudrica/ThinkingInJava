//: typeinfo/GenericClassReferences.java
package typeinfo;

public class GenericClassReferences {
    @SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
} ///:~
