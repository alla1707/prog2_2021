package aufgabe03;

public class TestClasse {
	
	public static void main(String[] args) {
		Solitaire game = new Solitaire();
		System.err.println("    START");
		System.out.println();
		game.print();
		System.out.println();
		int zug =1;
		while(game.moveFirstPossible())
		{
			System.err.println("Nach dem "+ zug+". move:");
			System.out.println();
			zug++;
			game.print();	
		}

		System.out.println("Keine mögliche Bewegung");
		game.print();
	}

}
