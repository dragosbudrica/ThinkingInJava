package access.exercises;

class Member {
	protected String str = "Str";
	protected int a = 10;
	protected long l = 1500L;
}

public class AccessEx6 {
	public void manipulateProt(Member m) {
		System.out.println("Initial protected string: " + m.str);
		System.out.println("Initial protected int: " + m.a);
		System.out.println("Initial protected long: " + m.l);
		
		m.str = "Dragos";
		m.a = 23;
		m.l = 46L;
		
		System.out.println("New protected string: " + m.str);
		System.out.println("New protected int: " + m.a);
		System.out.println("New protected long: " + m.l);
	}
	public static void main(String[] args) {
		AccessEx6 ae6 = new AccessEx6();
		ae6.manipulateProt(new Member());
	}
}
