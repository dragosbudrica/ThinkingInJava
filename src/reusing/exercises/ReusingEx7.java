package reusing.exercises;

class AModified {
	AModified(String aModif) {
		System.out.println(aModif);
		}
}

class BModified {
	BModified(String bModif) {
		System.out.println(bModif);
		}
}

class CModified extends AModified {
	@SuppressWarnings("unused")
	private BModified bModified;
	public CModified(String cModif, BModified bModif) {
		super("aModified");
		this.bModified = bModif;
		System.out.println(cModif);
	}
	
}

public class ReusingEx7 {
	public static void main(String[] args) {
		new CModified("cModified", new BModified("bModified"));
	}
}
