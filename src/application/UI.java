package application;

import model.chess.ChessPiece;

public class UI {

	//montando o tabuleiro para utilizar na classe principal
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}System.out.println("  a b c d e f g h");
	}
	
	//metodo interno para validar peça 
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			
			System.out.print("- ");
		}else
			System.out.print(piece + " ");
	}
}
