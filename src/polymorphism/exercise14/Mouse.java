package polymorphism.exercise14;

public class Mouse extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("lives around human house");
	@SuppressWarnings("unused")
	private Description t = new Description("eats any kind of fruit or grain from plants");
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	Mouse() { System.out.println("Mouse()"); }
	Mouse(Shared shared) {
		super(shared);
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
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
	public String toString() { return "Mouse " + id; }
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	protected void finalize() {
		System.out.println("Preparing to finalize Mouse...");     
		System.out.println("Finalized " + this);  
	}
}
