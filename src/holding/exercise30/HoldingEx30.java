package holding.exercise30;
import typeinfo.pets.*;
import java.util.*;

class CollectionSequence implements Collection<Pet> {
	private Pet[] pets = Pets.createArray(8);

	public int size() {
		return pets.length;
	}

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public boolean add(Pet pet) {
		pets = Arrays.copyOf(pets, pets.length + 1);
		pets[pets.length - 1] = pet;
		if (pets[pets.length - 1].equals(pet))
			return true;
		else
			return false;
	}

	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		for (Pet pet : c) {
			add(pet);
		}
		return true;
	}

	@Override
	public void clear() {
		pets = new Pet[0];
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < pets.length; i++)
			if (pets[i].equals(o))
				return true;
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		boolean containsAll = true;
		for (Object object : c) {
			if (!contains(object))
				containsAll = false;
		}
		return containsAll;
	}

	@Override
	public boolean isEmpty() {
		return pets.length == 0;
	}

	@Override
	public boolean remove(Object o) {
		if (contains(o)) {
			for (int i = 0; i < pets.length; i++) {
				if (pets[i].equals(o)) {
					for (int j = i + 1; j < pets.length; j++)
						pets[j - 1] = pets[j];
					break;
				}
			}
			pets = Arrays.copyOf(pets, pets.length - 1);
			return true;
		} else
			return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		if(containsAll(c)) {
			for (Object object : c) {
				remove(object);
			}
			return true;	
		}
		else
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		if(containsAll(c)) {
			Pet[] petsCopy = pets;
			pets = new Pet[c.size()];
			int currentIndex = 0;
			for(int i = 0; i < petsCopy.length; i++)
				for (Object object : c) {
					if(petsCopy[i].equals(object)) {
						pets[currentIndex++] = (Pet) object;
						break;
					}
				}
			return true;
		}
		else
			return false;
	}

	@Override
	public Object[] toArray() {
		return pets;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a) {
		if(a.length == pets.length)
			return (T[]) pets;
		else {
			Pet[] array = pets;
			return (T[]) array;
		}
	}

	public String toString() {
		return Arrays.toString(pets);
	}

	public static void printInitialCollection(CollectionSequence c) {
		System.out.println("Initial collection:");
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
	
	public static void proveAdd(CollectionSequence c) {
		c.add(Pets.randomPet());
		System.out.println("\nAfter adding an element:");
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
	
	public static void proveAddAll(CollectionSequence c, List<Pet> list) {
		c.addAll(list);
		System.out.println("\nAfter adding three elements at the same time:");
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}	
	public static void proveContains(CollectionSequence c) {
		System.out.println("\nTesting contains():");
		System.out.println("c.contains(c.pets[2]) ?  " + c.contains(c.pets[2]));
		System.out.println("c.contains(new Pet()) ?  "
				+ c.contains(new Pet()));
	}	
	public static void proveContainsAll(CollectionSequence c, List<Pet> list , List<Pet> list2) {
		System.out.println("\nTesting containsAll():");
		System.out.println("c.containsAll(list) ?  " + c.containsAll(list));
		System.out.println("c.containsAll(list2) ?  " + c.containsAll(list2));

	}	
	public static void proveRemove(CollectionSequence c) {
		System.out.println("\nTesting remove()");
		System.out.println("c.remove(new Pet()): " + c.remove(new Pet()));
		System.out.println("c.remove(c.pets[2]): " + c.remove(c.pets[2]));
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
	public static void proveRemoveAll(CollectionSequence c, List<Pet> list,  List<Pet> list2) {
		System.out.println("\nTesting removeAll()");
		System.out.println("c.removeAll(list2): " + c.removeAll(list2));
		System.out.println("c.removeAll(list): " + c.removeAll(list));
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
	public static void proveRetainAll(CollectionSequence c, List<Pet> list2,  List<Pet> list3) {
		System.out.println("\nTesting retainAll()");
		System.out.println("c.retainAll(list2): " + c.retainAll(list2));
		System.out.println("c.retainAll(list3): " + c.retainAll(list3));
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
	public static void proveToArray(CollectionSequence c, Pet[] array) {
		System.out.println("\nTesting toArray(): ");
		InterfaceVsIterator.display(Arrays.asList(array));
		InterfaceVsIterator.display(Arrays.asList(array).iterator());
	}
	public static void proveToArrayWithParameter(CollectionSequence c, Pet[] array2) {
		System.out.println("\nTesting toArray(new Pet[0]): ");
		InterfaceVsIterator.display(Arrays.asList(array2));
		InterfaceVsIterator.display(Arrays.asList(array2).iterator());
	}
	public static void proveIsEmptyAndClear(CollectionSequence c) {
		System.out.println("\nTesting isEmpty()");
		System.out.println("c.isEmpty() ? " + c.isEmpty());
		System.out.println("Clearing...");
		c.clear();
		System.out.println("c.isEmpty() ? " + c.isEmpty());
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator()); 
	}
	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		printInitialCollection(c);
		proveAdd(c);
		List<Pet> list = new ArrayList<Pet>();
		list.add(Pets.randomPet());
		list.add(Pets.randomPet());
		list.add(Pets.randomPet());
		proveAddAll(c, list);
		proveContains(c);
		List<Pet> list2 = new ArrayList<Pet>(list);
		list2.add(Pets.randomPet());
		proveContainsAll(c, list, list2);
		proveRemove(c);
		proveRemoveAll(c, list, list2);
		List<Pet> list3 = new ArrayList<Pet>();
		list3.add(c.pets[0]);
		list3.add(c.pets[1]);
		list3.add(c.pets[5]);
		proveRetainAll(c, list2, list3);
		Pet[] array = (Pet[]) c.toArray();
		proveToArray(c, array);
		Pet[] array2 = (Pet[]) c.toArray(new Pet[0]);
		proveToArrayWithParameter(c, array2);
		proveIsEmptyAndClear(c);
	}
}

public class HoldingEx30 {
	public static void main(String[] args) {
		CollectionSequence.main(args);
	}
}
