package gameplay;

import java.util.Scanner;

import entities.Board;
import entities.Player;

public class Console {

	public static void displayBoard(Board board) {

		char[][] gameBoard = board.getBoard();
		int n = gameBoard.length;
		int m = gameBoard[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((int) gameBoard[i][j] - 48 <= 9) {
					System.out.print("-" + gameBoard[i][j] + "-  ");
				} else {
					System.out.print(" "+gameBoard[i][j] + "  ");
				}
			}
			System.out.println("\n");
		}

	}

	public static int takeInputs() {

		System.out.println("****************** TIC-TAC-TOE *********************** \n\n");
		System.out.println("<- BOARD STATE ->\n");
		displayBoard(Board.getBoardObject());

		System.out.print("\nFor Player 1 -> Press 1 for 'X' OR  Press 0 for 'O' : ");
		Scanner sc = new Scanner(System.in);
		int symbol = sc.nextInt();

		return symbol;

	}

	static void displayWinners() {

	}

	public static void displayPlayers(Player player1, Player player2) {
		System.out.println("\n<- PLAYER STATES ->\n");
		System.out.println("Player 1: -> " + player1);
		System.out.println("Player 2: -> " + player2);

		System.out.println("\n ************ GAME BEGINS ************ ");
	}

	public static int getPlayerChoice(int playerNo) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPlayer " + playerNo + ", please enter your cell choice : ");

		return sc.nextInt();
	}

}
