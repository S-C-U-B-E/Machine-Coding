package gameplay;

import entities.*;

public class GamePlay {
	public static void main(String args[]) {
		int symbol;
		symbol = Console.takeInputs();

		Game.start(symbol);
		Console.displayPlayers(Game.player1, Game.player2);
		play(Board.getBoardObject());
	}

	private static void play(Board boardObj) {

		int choice;
		while (!isWinnerDecided()) {
			if (Game.player1.isTurn()) {
				choice = getChoiceAndValidation(1);
				boardObj.modifyBoard(1, evaluateRowFromChoice(choice, boardObj.getColumnLength()),
						evaluateColumnFromChoice(choice, boardObj.getColumnLength()));
				Console.displayBoard(boardObj);
				Game.player1.incrementTurnCount();
				System.out.println(Game.player1.getTurnCount());
				Game.player1.setTurn(false);
				Game.player2.setTurn(true);

			} else if (Game.player2.isTurn()) {
				choice = getChoiceAndValidation(2);
				boardObj.modifyBoard(2, evaluateRowFromChoice(choice, boardObj.getColumnLength()),
						evaluateColumnFromChoice(choice, boardObj.getColumnLength()));
				Console.displayBoard(boardObj);
				Game.player2.incrementTurnCount();
				System.out.println(Game.player2.getTurnCount());
				Game.player1.setTurn(true);
				Game.player2.setTurn(false);

			}
		}

	}

	private static boolean isWinnerDecided() {
		// TODO Auto-generated method stub
		return false;
	}

	private static int getChoiceAndValidation(int player) {
		int choice;
		while (true) {
			choice = Console.getPlayerChoice(player);
			if (isValidChoice(choice))
				return choice;
		}

	}

	private static boolean isValidChoice(int choice) {

		Board boardObj = Board.getBoardObject();
		int columnLength = boardObj.getColumnLength();

		// USERS ARE PROVIDING 1 BASED INDEX INPUT
		int row = evaluateRowFromChoice(choice, columnLength);
		int column = evaluateColumnFromChoice(choice, columnLength);

		if (boardObj.getSymbol(row, column) == 'X' || boardObj.getSymbol(row, column) == 'O')
			return false;
		else
			return true;
	}

	private static int evaluateRowFromChoice(int choice, int columnLength) {
		int row;
		if (choice % columnLength == 0) {
			row = choice / columnLength - 1;
		} else {
			row = choice / columnLength;
		}

		return row;
	}

	private static int evaluateColumnFromChoice(int choice, int columnLength) {
		int column;
		if (choice % columnLength == 0) {
			column = columnLength - 1;
		} else {
			column = choice % columnLength - 1;
		}

		return column;
	}
}
