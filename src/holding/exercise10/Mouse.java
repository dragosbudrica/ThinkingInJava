package holding.exercise10;

public class Mouse extends Rodent {
	@Override
	public void walk() {
		System.out.println("The Mouse walks around the house"); 
		}
	@Override
	public void bite() {
		System.out.println("The Mouse bites a grain seed"); 
		}
	@Override
	public void eat() {
		System.out.println("The Mouse eating plants"); 
		}
}
