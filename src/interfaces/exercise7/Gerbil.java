package interfaces.exercise7;

public class Gerbil implements Rodent {
	@Override
	public void walk() {
		System.out.println("The Gerbil walks in Africa"); 
		}
	@Override
	public void bite() {
		System.out.println("The Gerbil bites a burrito"); 
		}
	@Override
	public void eat() {
		System.out.println("The Gerbil eating a carrot"); 
		}
}
