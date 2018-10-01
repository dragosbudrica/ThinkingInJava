package reusing.exercises;

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

/*class BoardGame extends Game {
	BoardGame(int i) { // Implicit super constructor Game() is undefined. Must explicitly invoke another constructor 
		System.out.println("BoardGame constructor");
		super(11); // Constructor call must be the first statement in a constructor
	}
} 

class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("ChessProof constructor");
	}
} */

public class ReusingEx6 {
	public static void main(String[] args) {
	//	ChessProof x = new ChessProof();
	}
}
