package model.board.layer;


public class Board {
	
	private Piece[][] pieces;
	private Integer linhas;
	private Integer colunas;
	
	public Board() {
	}

	public Board(Integer linhas, Integer colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new BoardException("Falha ao montar o tabuleiro");
		}
		pieces = new Piece[linhas][colunas];
		this.linhas = linhas;
		this.colunas = colunas;
	}

	public Integer getLinhas() {
		return linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public Piece piece(Integer linha, Integer coluna) {
		if (!positionExists(linha, coluna)) {
			throw new BoardException("Posição do tabuleiro invalida");
		}
		return pieces[linha][coluna];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getLinha()][position.getColuna()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Posição " + position + " ja esta ocupada por outra peça.");
		}
		pieces[position.getLinha()][position.getColuna()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(Integer linha, Integer coluna ) {
		return linha >=0 && linha < linhas && coluna >=0 && coluna < colunas;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getLinha(), position.getColuna());

	}
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição do tabuleiro invalida");
		}
		return piece(position) != null;

	}
	
}
