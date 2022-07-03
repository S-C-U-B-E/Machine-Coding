package entities;

import java.util.Arrays;

// NEED TO MODIFY THE CLASS , AS i WANT JUST A SINGLE INSTANCE OF THIS BOARD FOR A GAME
public class Board {

	private char[][] board;
	private static Board boardObject;
	private static int rowLength;
	private static int columnLength;

	private Board() {
		rowLength = 3;
		columnLength = 3;
		board = new char[rowLength][columnLength];

		// Initializing board with cell numbers
		int temp = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = (char) (j + temp + 48);
			}
			temp += board[0].length;
		}

	}

	public static Board getBoardObject() {
		if (boardObject == null) {
			boardObject = new Board();
		}

		return boardObject;
	}

	public char[][] getBoard() {
		return board;
	}

	public int getRowLength() {
		return rowLength;
	}

	public int getColumnLength() {
		return columnLength;
	}

	public char getSymbol(int row, int column) {
		return board[row][column];
	}

	public void modifyBoard(int player, int row, int column) {
		if (player == 1) {
			getBoardObject().board[row][column] = Game.player1.getSymbol();
		} else {
			getBoardObject().board[row][column] = Game.player2.getSymbol();
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (char[] ar : board)
			s += Arrays.toString(ar) + "\n";
		return "Board [board= \n" + s + "]";
	}

}
