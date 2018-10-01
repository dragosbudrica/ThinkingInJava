package exceptions.exercises;

interface Selector {
	boolean end();
	Object current();
	void next();
}

class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x) {
			items[next++] = x;
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; }
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 11; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}

public class ExceptionsEx12 {
	public static void main(String[] args) {
		Sequence.main(args);
	}
}
