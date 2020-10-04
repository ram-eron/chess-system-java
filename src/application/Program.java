package application;


import model.chess.ChessMatch;
import model.chess.ChessPiece;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chassMatch = new ChessMatch();
		UI.printBoard(new ChessPiece[8][8]);
	}

}
