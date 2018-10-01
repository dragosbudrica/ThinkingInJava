package strings.exercise18;

public class JavaSourceCodeWithStringLiterals {
	private String str1 = "Dragos";
	private String str2 = new String("Andrei");
	
	public JavaSourceCodeWithStringLiterals() {
		this.str1 = "DefaultName";
		this.str2 = new String("DefaultName2");
	}
	
	public JavaSourceCodeWithStringLiterals(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public String getStr1() {
		return str1;
	}
	
	public String getStr2() {
		return str2;
	}
	
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public void areEquals(String str2) {
		if(str1.equals(str2))
			System.out.println("str1 and "
					+ "str2 are" +
					"equals");
		else
			System.out.println("str1 and str2" +
					" are" + " not equals");
	}
}
