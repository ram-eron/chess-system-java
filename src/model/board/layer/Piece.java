package model.board.layer;

public  class Piece {
	
	protected Position position;
	private Board board;
		
	public Piece() {
	}
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}	


	public boolean possibleMove(Position position) {
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		return false;

	}
	
	protected Board getBoard() {
		return board;
	}


}
