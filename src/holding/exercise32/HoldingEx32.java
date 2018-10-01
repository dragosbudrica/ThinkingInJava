package holding.exercise32;
import typeinfo.pets.*;
import java.util.*;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;
			public boolean hasNext() {
				return index < pets.length;
			}
			public Pet next() { return pets[index++]; }
			public void remove() { 
				throw new UnsupportedOperationException();
			}
		};
	}
	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					private int index = pets.length - 1;
					public boolean hasNext() {
						return index > -1;
					}
					public Pet next() { return pets[index--]; }
					public void remove() { 
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	public Iterable<Pet> shuffled() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				List<Pet> shuffled = 
						new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
		for (Pet p : nc) {
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for (Pet p : nc.reversed()) {
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		for (Pet p : nc.shuffled()) {
			System.out.print(p.id() + ":" + p + " ");
		}
	}
}

public class HoldingEx32 {
	public static void main(String[] args) {
		NonCollectionSequence.main(args);
	}
}