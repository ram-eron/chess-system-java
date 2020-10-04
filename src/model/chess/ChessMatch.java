package model.chess;

import model.board.layer.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	
	public ChessPiece[][] getpieces(){
		ChessPiece[][] matriz = new ChessPiece[board.getLinhas()][board.getColunas()];
		for (int i = 0; i < board.getLinhas(); i++) {
			for (int j = 0; j < board.getColunas(); j++) {
				matriz[i][j] =(ChessPiece) board.piece(i,j);
			}
		}
		
		return matriz;
	}
}
