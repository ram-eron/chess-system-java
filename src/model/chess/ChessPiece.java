package model.chess;

import model.board.layer.Board;
import model.board.layer.Piece;

public class ChessPiece extends Piece {
	private Color color;
	private Integer moveCount;

	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}


	public Color getColor() {
		return color;
	}


	public Integer getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(Integer moveCount) {
		this.moveCount = moveCount;
	}
	
	
	
	
}

