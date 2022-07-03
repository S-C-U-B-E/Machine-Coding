package entities;

import gameplay.Console;

public class Game {
	
	static char[] symbols = {'X', 'O'};
	public static Player player1;
	public static Player player2;
	public static Board board;
	
	//Start method -> Will initialize other objects and send them to the play arena
	public static void start(int symbol) {
		if(symbol > 1) {
			System.out.println("Please choose b/w 1 OR 0 for symbol..");
			return;
		}
		
		player1 = new Player(false, true, 0, symbols[symbol^1]);
		player2 = new Player(false, false, 0, symbols[symbol]);
		
	}
	
	//Stop method -> Will resent the arena/board to it's original state
	public static void stop() {
		
	}
	
}
