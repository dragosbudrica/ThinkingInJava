package strings.exercises;
import java.util.Scanner;

class Class {
	private int intMember;
	private long longMember;
	private float floatMember;
	private double doubleMember;
	private String stringMember;
	
	public static Scanner input;
	public Class(String str) {
		input = new Scanner(str);
		this.intMember = input.nextInt();
		this.longMember = input.nextLong();
		this.floatMember = input.nextFloat();
		this.doubleMember = input.nextDouble();
		this.stringMember = input.next();
		input.close();
	}

	public int getIntMember() {
		return intMember;
	}

	public void setIntMember(int intMember) {
		this.intMember = intMember;
	}

	public long getLongMember() {
		return longMember;
	}

	public void setLongMember(long longMember) {
		this.longMember = longMember;
	}

	public float getFloatMember() {
		return floatMember;
	}

	public void setFloatMember(float floatMember) {
		this.floatMember = floatMember;
	}

	public double getDoubleMember() {
		return doubleMember;
	}

	public void setDoubleMember(double doubleMember) {
		this.doubleMember = doubleMember;
	}

	public String getStringMember() {
		return stringMember;
	}

	public void setStringMember(String stringMember) {
		this.stringMember = stringMember;
	}
	
	public String toString() {
		return String.format("My name is %s and I'm %d years old.\n" +
			   "My favorites long, float and double are %d, %f, %f.", stringMember, intMember, longMember, floatMember, doubleMember);
	}
}

public class StringsEx20 {
	public static void main(String[] args) {
		Class obj = new Class("23 231235 30.00516 25.001122 Dragos");
		System.out.println(obj);
	}
}
