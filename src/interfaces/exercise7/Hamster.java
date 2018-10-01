package interfaces.exercise7;

public class Hamster implements Rodent {
	@Override
	public void walk() {
		System.out.println("The Hamster walks in a cage"); 
		}
	@Override
	public void bite() {
		System.out.println("The Hamster bites a seed"); 
		}
	@Override
	public void eat() {
		System.out.println("The Hamster eating grasses"); 
		}
}
