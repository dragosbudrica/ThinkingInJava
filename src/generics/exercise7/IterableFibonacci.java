package generics.exercise7;
import java.util.*;
import generics.*;

public class IterableFibonacci implements Iterable<Integer> {
	private Fibonacci fibonacci = new Fibonacci();
	private int n;
	public IterableFibonacci(int count) { n = count; }
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() { return n > 0; }
			public Integer next() {
				n--;
				return IterableFibonacci.this.fibonacci.next();
			}
			public void remove() { 
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		for(int i : new IterableFibonacci(18))
			System.out.print(i + " ");
	}
	
}
