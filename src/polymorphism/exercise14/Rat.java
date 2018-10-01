package polymorphism.exercise14;

public class Rat extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("opportunistic survivors");
	@SuppressWarnings("unused")
	private Description t = new Description("eats mice and plants");
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	Rat() { System.out.println("Rat()"); }
	Rat(Shared shared) {
		super(shared);
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
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
	public String toString() { return "Rat " + id; }
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	protected void finalize() {
		System.out.println("Preparing to finalize Rat...");     
		System.out.println("Finalized " + this);  
	}
}
