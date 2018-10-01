package innerclasses.exercise22;

interface Selector {
	boolean end();
	Object current();
	void next();
}

interface ReverseSelector {
	boolean first();
	Object current();
	void previous();
}

class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; }
	}
	private class SequenceReverseSelector implements ReverseSelector {
		private int i = items.length - 1;
		public boolean first() { return i == -1; }
		public Object current() { return items[i]; }
		public void previous() { if(i >= 0) i--; }
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public ReverseSelector reverseSelector() {
		return new SequenceReverseSelector();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		System.out.println("\nReverse:");
		ReverseSelector selector2 = sequence.reverseSelector();
		while(!selector2.first()) {
			System.out.print(selector2.current() + " ");
			selector2.previous();
		}
	}
}

public class InnerClassesEx22 {
	public static void main(String[] args) {
		Sequence.main(args);
	}
}
