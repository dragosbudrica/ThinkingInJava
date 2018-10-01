package interfaces.exercise16;
import java.nio.CharBuffer;
import java.util.Scanner;

class RandomCharSequence implements Readable {
	private int numberOfChars;
	
	public RandomCharSequence(int numberOfChars) {
		this.numberOfChars = numberOfChars;
	}
	
	@Override
	public int read(CharBuffer cb) {
		for(int i = 0; i < numberOfChars; i++)
			cb.append((char)((int)(1 + Math.random() * 127)));
		return -1;
	}
}

public class InterfacesEx16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(new RandomCharSequence(10));
		while(input.hasNext())
			System.out.println(input.next());
		input.close();
	}
}
