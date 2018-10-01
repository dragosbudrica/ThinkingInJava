package polymorphism.exercise14;

public class Hamster extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("remains underground during the day");
	@SuppressWarnings("unused")
	private Description t = new Description("eats seeds, fruits and vegetation");
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	Hamster() { System.out.println("Hamster()"); }
	Hamster(Shared shared) {
		super(shared);
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
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
	public String toString() { return "Hamster " + id; }
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	protected void finalize() {
		System.out.println("Preparing to finalize Hamster...");     
		System.out.println("Finalized " + this);  
	}
}
