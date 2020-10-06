package model.chess.pieces;

import model.board.layer.Board;
import model.chess.ChessPiece;
import model.chess.Color;

public class Rei extends ChessPiece {

	public Rei(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	
}
