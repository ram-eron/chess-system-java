package model.board.layer;

public class Board {
	
	private Piece[][] pieces;
	private Integer linhas;
	private Integer colunas;
	
	public Board() {
	}

	public Board(Integer linhas, Integer colunas) {
		pieces = new Piece[linhas][colunas];
		this.linhas = linhas;
		this.colunas = colunas;
	}

	public Integer getLinhas() {
		return linhas;
	}

	public void setLinhas(Integer linhas) {
		this.linhas = linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public void setColunas(Integer colunas) {
		this.colunas = colunas;
	}

	public Piece piece(Integer linha, Integer coluna) {
		return pieces[linha][coluna];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getLinha()][position.getColuna()];
	}

}
