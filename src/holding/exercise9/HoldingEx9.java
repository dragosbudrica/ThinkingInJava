package holding.exercise9;
import java.util.*;

class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceIterator implements Iterator<String> {
		private int i = 0;
		@Override
		public boolean hasNext() {
			return (i != items.length);
		}
		@Override
		public String next() {
			return (String)items[i++];
		}
	}
	public Iterator<String> iterator() {
		return new SequenceIterator();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Iterator<String> iterator = sequence.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str + " ");
		}
	}
}

public class HoldingEx9 {
	public static void main(String[] args) {
		Sequence.main(args);
	}
}
