package generics.exercise11;
import java.util.*;
import net.mindview.util.*;

public class GenericsEx11 {
	public static void main(String[] args) {
		Map<Section, List<Student>> sectionStudent = New.map();
		List<Student> listOfStudentsEnrolledToComputersInEnglish = New.list();
		List<Student> linkedListOfStudentsEnrolledToComputersInRomanian = New.lList();
		Set<Section> setOfSections = New.set();
		Queue<Student> queueOfStudents = New.queue();
		
		testMap(sectionStudent);
		testList(listOfStudentsEnrolledToComputersInEnglish);
		testLinkedList(linkedListOfStudentsEnrolledToComputersInRomanian);
		testSet(setOfSections);
		testQueue(queueOfStudents);
	}
	
	public static void testMap(Map<Section, List<Student>> sectionStudent) {
		Section computersInEnglish = new Section("Computers in English");
		List<Student> studentsEnrolledToComputersInEnglish = new ArrayList<>();
		List<Student> studentsEnrolledToComputersInRomanian = new ArrayList<>();
		
		studentsEnrolledToComputersInEnglish.add(new Student("Dragos", "Budrica"));
		studentsEnrolledToComputersInEnglish.add(new Student("Adrian", "Popa"));
		studentsEnrolledToComputersInEnglish.add(new Student("Dan", "Pasca"));
		studentsEnrolledToComputersInEnglish.add(new Student("Stefanita", "Urziceanu"));
		studentsEnrolledToComputersInEnglish.add(new Student("Adrian", "Gheorghe"));
		
		Section computersInRomanian = new Section("Computers in Romanian");
		
		studentsEnrolledToComputersInRomanian.add(new Student("Mihai", "Gugu"));
		studentsEnrolledToComputersInRomanian.add(new Student("Margareta", "Budana"));
		studentsEnrolledToComputersInRomanian.add(new Student("Alina", "Tulba"));
		studentsEnrolledToComputersInRomanian.add(new Student("Catalin", "Lion"));
		studentsEnrolledToComputersInRomanian.add(new Student("Florin", "Morcoase"));
		
		sectionStudent.put(computersInEnglish, studentsEnrolledToComputersInEnglish);
		sectionStudent.put(computersInRomanian, studentsEnrolledToComputersInRomanian);
		
		System.out.println("Map: " + sectionStudent);
	}
	
	public static void testList(List<Student> listOfStudentsEnrolledToComputersInEnglish) {
		listOfStudentsEnrolledToComputersInEnglish.add(new Student("Dragos", "Budrica"));
		listOfStudentsEnrolledToComputersInEnglish.add(new Student("Adrian", "Popa"));
		listOfStudentsEnrolledToComputersInEnglish.add(new Student("Dan", "Pasca"));
		listOfStudentsEnrolledToComputersInEnglish.add(new Student("Stefanita", "Urziceanu"));
		listOfStudentsEnrolledToComputersInEnglish.add(new Student("Adrian", "Gheorghe"));
		
		System.out.println("List of Students enrolled to Computers in English: " + listOfStudentsEnrolledToComputersInEnglish);
	}
	
	public static void testLinkedList(List<Student> linkedListOfStudentsEnrolledToComputersInRomanian) {
		linkedListOfStudentsEnrolledToComputersInRomanian.add(new Student("Mihai", "Gugu"));
		linkedListOfStudentsEnrolledToComputersInRomanian.add(new Student("Margareta", "Budana"));
		linkedListOfStudentsEnrolledToComputersInRomanian.add(new Student("Alina", "Tulba"));
		linkedListOfStudentsEnrolledToComputersInRomanian.add(new Student("Catalin", "Lion"));
		linkedListOfStudentsEnrolledToComputersInRomanian.add(new Student("Florin", "Morcoase"));
		
		System.out.println("Linked list of Students enrolled to Computers in Romanian: " + linkedListOfStudentsEnrolledToComputersInRomanian);
	}
	
	public static void testSet(Set<Section> setOfSections) {
		Section computersInEnglish = new Section("Computers in English");
		Section computersInRomanian = new Section("Computers in Romanian");
		Section sectionDuplicate = new Section("Computers in Romanian");
		
		setOfSections.add(computersInEnglish);
		setOfSections.add(computersInRomanian);
		setOfSections.add(sectionDuplicate);
		
		System.out.println("Set of sections: " + setOfSections);
	}
	
	public static void testQueue(Queue<Student> queueOfStudents) {
		queueOfStudents.add(new Student("Mihai", "Gugu"));
		queueOfStudents.add(new Student("Margareta", "Budana"));
		queueOfStudents.add(new Student("Alina", "Tulba"));
		queueOfStudents.add(new Student("Catalin", "Lion"));
		queueOfStudents.add(new Student("Florin", "Morcoase"));
		
		System.out.println("Queue of students: " + queueOfStudents);
	}
}
