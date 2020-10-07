package model.chess;

import model.board.layer.Position;

public class ChessPosition {
	private char coluna;
	private Integer linha;
	
	public ChessPosition(char coluna, Integer linha) {
		if (coluna <'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ChessException("erro ao iniciar as posições do tabuleiro, permitido a-h 1-8");
			
		}
		
		this.coluna = coluna;
		this.linha = linha;
	}
	
	public char getColuna() {
		return coluna;
	}

	public Integer getLinha() {
		return linha;
	}

	protected Position toPosition() {
		return new Position(8 - linha, coluna - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' -position.getColuna()), 8 - position.getLinha());
	}
}
