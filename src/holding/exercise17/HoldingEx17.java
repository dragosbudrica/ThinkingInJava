package holding.exercise17;
import java.util.*;

class Gerbil {
	private int gerbilNumber;
	Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	public void hop() {
		System.out.println("Gerbil " + gerbilNumber + " is hopping!");
	}
}

public class HoldingEx17 {
	public static void main(String[] args) {
		Map<String,Gerbil> gerbils = new HashMap<String,Gerbil>(); 
		gerbils.put("Fuzzy", new Gerbil(1));
		gerbils.put("Fizzy", new Gerbil(2));
		gerbils.put("Spot", new Gerbil(3));
		gerbils.put("Freckly", new Gerbil(4));
		gerbils.put("Shackleton", new Gerbil(5));
		Iterator<String> it = gerbils.keySet().iterator();
		while(it.hasNext()) {
			String gerbilName = it.next();
			Gerbil gerbil = gerbils.get(gerbilName);
			System.out.print(gerbilName + ": ");
			gerbil.hop();
		}
	}
}



