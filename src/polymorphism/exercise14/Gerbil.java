package polymorphism.exercise14;

public class Gerbil extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("lives in groups in the wild");
	@SuppressWarnings("unused")
	private Description t = new Description("desert rat");
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	Gerbil() { System.out.println("Gerbil()"); }
	Gerbil(Shared shared) {
		super(shared);
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
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
	public String toString() { return "Gerbil " + id; }
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	protected void finalize() {
		System.out.println("Preparing to finalize Gerbil...");     
		System.out.println("Finalized " + this);  
	}
}
