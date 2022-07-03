package entities;

public class Player {
	
	private boolean isWon;
	private boolean isTurn;
	private int turnCount;
	private char symbol;
	
	public Player() {}
	
	public Player(boolean isWon, boolean isTurn, int turnCount, char symbol) {
		this.isWon = isWon;
		this.isTurn = isTurn;
		this.turnCount = turnCount;
		this.symbol = symbol;
	}
	
	public boolean isWon() {
		return isWon;
	}
	public void setWon(boolean isWon) {
		this.isWon = isWon;
	}
	public boolean isTurn() {
		return isTurn;
	}
	public void setTurn(boolean isTurn) {
		this.isTurn = isTurn;
	}
	public int getTurnCount() {
		return turnCount;
	}
	public void incrementTurnCount() {
		this.turnCount++;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "Player [isWon=" + isWon + ", isTurn=" + isTurn + ", turnCount=" + turnCount + ", symbol=" + symbol
				+ "]";
	}
	
	

}
