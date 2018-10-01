package initialization.exercises;

class PrintArgs {
	public static void main(String... args) {
		for (String str : args) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}

public class InitializationEx20 {
	public static void main(String[] args) {
		PrintArgs.main(new String[]{"----------------"});
		PrintArgs.main("1", "2", "3");
		PrintArgs.main(new String[] {"4", "5"});
		PrintArgs.main("6");
		PrintArgs.main("----------------");
		PrintArgs.main();
	}
}
