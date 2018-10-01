//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.
package exceptions;

public class Cleanup {
	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("src\\exceptions\\Cleanup.java");
			try {
				@SuppressWarnings("unused")
				String s;
				@SuppressWarnings("unused")
				int i = 1;
				while((s = in.getLine()) != null)
				   ; // Perform line-by-line processing here...
			} catch(Exception e) {
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch(Exception e) {
			System.out.println("InputFile construction failed");
		}
	}
} /* Output:
dispose() successful
*///:~
