package holding.exercise10;

public class Rat extends Rodent {
	@Override
	public void walk() {
		System.out.println("The Rat walks in field in crop"); 
		}
	@Override
	public void bite() {
		System.out.println("The Rat bites a piece of wood"); 
		}
	@Override
	public void eat() {
		System.out.println("The Rat eating mice"); 
		}
}
