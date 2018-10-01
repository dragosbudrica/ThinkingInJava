package holding.exercises;
import java.util.*;

class ClassWithMember {
	private int number;
	ClassWithMember(int number) {
		this.number = number;
	}
	public String toString() {
		return "HoldingEx7 " + number;
	}
}

public class HoldingEx7 {
	public static void main(String[] args) {
		ClassWithMember[] cwmArr = new ClassWithMember[10];
		for(int i = 0; i < cwmArr.length; i++)
			cwmArr[i] = new ClassWithMember(i);
		System.out.println("Array: " + Arrays.toString(cwmArr));
		List<ClassWithMember> he7List = new ArrayList<ClassWithMember>();
		Collections.addAll(he7List, cwmArr);
		System.out.println("Initial list: " + he7List);
		List<ClassWithMember> he7SubList = he7List.subList(2, 5);
		System.out.println("SubList: " + he7SubList);
		he7List.removeAll(he7SubList);
		System.out.println("List after removing subset: " + he7List);
	}
}