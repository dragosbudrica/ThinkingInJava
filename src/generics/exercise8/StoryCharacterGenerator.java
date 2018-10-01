package generics.exercise8;
import java.util.*;
import net.mindview.util.*;

public class StoryCharacterGenerator
implements Generator<StoryCharacter>, Iterable<StoryCharacter> {
	@SuppressWarnings("rawtypes")
	private Class[] types = { Apocalypse.class, Sinister.class, Cyclop.class, Gambit.class,
			Wolverine.class };
	private static Random rand = new Random(47);
    public StoryCharacterGenerator() {}
    
    private int size = 0;
    public StoryCharacterGenerator(int sz) { size = sz; }
    
    @SuppressWarnings("deprecation")
	@Override
    public StoryCharacter next() {
    	try {
    		return (StoryCharacter)
    				types[rand.nextInt(types.length)].newInstance();
    	} catch(Exception e) {
    		throw new RuntimeException(e);
    	}
    }
    
    class StoryCharacterIterator implements Iterator<StoryCharacter> {
    	int count = size;
    	public boolean hasNext() { return count > 0; }
    	public StoryCharacter next() {
    		count--;
    		return StoryCharacterGenerator.this.next();
    	}
    	public void remove() {
    		throw new UnsupportedOperationException();
    	}
    };
	
	@Override
	public Iterator<StoryCharacter> iterator() {
		return new StoryCharacterIterator();
	}
	
	public static void main(String[] args) {
		StoryCharacterGenerator gen = new StoryCharacterGenerator();
		for(int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for(StoryCharacter sc : new StoryCharacterGenerator(5))
			System.out.println(sc);
	}
}
