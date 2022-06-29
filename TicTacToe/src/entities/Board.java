package entities;


// NEED TO MODIFY THE CLASS , AS i WANT JUST A SINGLE INSTANCE OF THIS BOARD FOR A GAME
public class Board {
	
	private char[][] board;
	private static Board boardObject;

	private Board() {
		board = new char[3][3];
	}
	
	public char[][] getBoard() {
		return board;
	}
	
	public static Board getBoardObject() {
		if(boardObject == null) {
			boardObject = new Board();
		}
		
		return boardObject;
	}

}
