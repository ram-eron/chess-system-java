package model.chess;

import model.board.layer.Board;
import model.board.layer.Position;
import model.chess.pieces.Rei;
import model.chess.pieces.Torre;

public class ChessMatch {
	//classe partida possui um tabuleiro
	private Board board;
	
	//contrutor com a disposição inicial das peças
	public ChessMatch() {
		board = new Board(8, 8);
		inicialSetup();
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
	
	private void inicialSetup() {
		board.placePiece(new Torre(board, Color.WHITE), new Position(2,1));
		board.placePiece(new Rei(board, Color.WHITE), new Position(9,1));
		board.placePiece(new Rei(board, Color.BLACK), new Position(7,1));
	}
	
}
