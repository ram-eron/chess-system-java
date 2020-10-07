package application;


import java.util.InputMismatchException;
import java.util.Scanner;

import model.chess.ChessMatch;
import model.chess.ChessPiece;
import model.chess.ChessPosition;
import model.chess.ChessException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//instanciando uma nova partida
		ChessMatch chassMatch = new ChessMatch();
		//mostrando o tabuleiro na tela
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chassMatch.getpieces());
				System.out.println();
				
				System.out.println("Informe a posição origem");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				
				System.out.println("Informe a posição destino");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chassMatch.performChessMove(source, target);
				
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			
					
					
		}
		
		
	}

}
