package strings.exercise19;

/**
 * This is just a simple java which has a lot of comments.
 * @author Dragos
 *
 */
public class JavaSourceCodeWithComments {
	// field1
	private String field1;
	
	// field2
	private int field2;
	
	/* This is the default 
	 * constructor of 
	 * the class
	 */
	public JavaSourceCodeWithComments() {
		this.field1 = "Andrei";
		this.field2 = 23;
	}
	
	/* This is a constructor 
	 * which takes a String and an int as parameters
	 */
	public JavaSourceCodeWithComments(String field1, int field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	
	// field1 accesor
	public String getField1() {
		return field1;
	}
	
	// field2 accessor
	public int getField2() {
		return field2;
	}
	
	// field1 mutator
	public void setField1(String field1) {
		this.field1 = field1;
	}
	
	// field2 mutator
	public void setField2(int field2) {
		this.field2 = field2;
	}
}
