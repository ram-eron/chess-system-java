package model.chess.pieces;

import model.board.layer.Board;
import model.chess.ChessPiece;
import model.chess.Color;

public class Torre extends ChessPiece {

	public Torre(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "T";
	}
	
	
	
}
