package polymorphism.exercise12;

public class Mouse extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("lives around human house");
	@SuppressWarnings("unused")
	private Description t = new Description("eats any kind of fruit or grain from plants");
	Mouse() { System.out.println("Mouse()"); }
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
