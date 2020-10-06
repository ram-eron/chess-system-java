package application;


import model.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		//instanciando uma nova partida
		ChessMatch chassMatch = new ChessMatch();
		//mostrando o tabuleiro na tela
		UI.printBoard(chassMatch.getpieces());
	}

}
