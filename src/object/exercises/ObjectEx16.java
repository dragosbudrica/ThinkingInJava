package object.exercises;

/**
 * The outer class proves the method overloading.
 * @author Dragos
 *
 */
public class ObjectEx16 {
	/**
	 * In this inner class, the info() method has been overloaded.
	 * @author Dragos
	 *
	 */
	class Tree {
		/**
		 * int data member which stores the height of the Tree.
		 */
		int height;
		/**
		 * Default Tree constructor that creates a Tree with height 0.
		 */
		Tree() {
			System.out.println("Planting a seedling");
			height = 0;
		}
		/** 
		 * Constructor that creates a Tree based on a specific height.
		 * @param initialHeight initial height of the Tree
		 */
		Tree(int initialHeight) {
			height = initialHeight;
			System.out.println("Creating new Tree that is " +
					height + " feet tall");
		}
		/**
		 * Method without parameters that offers informations about the Tree.
		 */
		void info() {
			System.out.println("Tree is " + height + " feet tall");
		}
		/**
		 * Info overloaded, which takes a String as a parameter.
		 * @param s a String object.
		 */
		void info(String s) {
			System.out.println(s + ": Tree is " + height + " feet tall");
		}
	}
	/** Entry point to class &amp; application.
	 * @param args array of string arguments
	 */
	public static void main(String[] args) { 
		ObjectEx16 oe16 = new ObjectEx16();
		for(int i = 0; i < 5; i++) {       
			Tree t = oe16.new Tree(i);       
			t.info();       
			t.info("overloaded method");     
			}     
		oe16.new Tree();   
		}  
}
