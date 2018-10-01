package generics.exercise11;
import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String toString() {
		return getFullName();
	}
	
	public boolean equals(Object otherStudent) {
		return this.getFullName().equals(((Student)otherStudent).getFullName());
	}
	
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
}
