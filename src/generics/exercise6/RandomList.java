package generics.exercise6;
import java.util.*;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T item) { storage.add(item); }
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for(String s : ("The quick brown fox jumped over " +
				"the lazy brown dog").split(" "))
			rs.add(s);
		for(int i = 0; i < 11; i++)
			System.out.print(rs.select() + " ");
		System.out.println();
		
		RandomList<Integer> ri = new RandomList<Integer>();
		for(Integer i : new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
			ri.add(i);
		for(int i = 0; i < 11; i++)
			System.out.print(ri.select() + " ");
		System.out.println();
		
		RandomList<Double> rd = new RandomList<Double>();
		for(Double d : new Double[] {0.53, 1.21, 2.23, 3.34, 4.65, 5.31, 6.98, 7.95, 8.62, 9.94})
			rd.add(d);
		for(int i = 0; i < 11; i++)
			System.out.print(rd.select() + " ");
	}
}
