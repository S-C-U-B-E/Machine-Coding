package entities;

public class Game {
	
	private static char[] symbols = {'X', 'O'};
	private static Player player1;
	private static Player player2;
	private static Board board;
	
	//Start method -> Will initialize other objects and send them to the play arena
	static void start(int symbol) {
		if(symbol > 1) {
			System.out.println("Please choose b/w 1 OR 0 for symbol..");
			return;
		}
		
		player1 = new Player(false, true, 0, symbols[symbol]);
		player2 = new Player(false, false, 0, symbols[symbol]);
		
		board = Board.getBoardObject();
		
	}
	
	//Stop method -> Will resent the arena/board to it's original state
	static void stop() {
		
	}
	
}
