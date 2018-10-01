package generics.exercise12;
import java.util.Objects;

public class Section {
	private String name;
	
	public Section(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object otherSection) {
		return this.name.equals(((Section)otherSection).getName());
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
}
