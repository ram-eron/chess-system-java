package model.board.layer;

public class Position {

	private Integer linha;
	private Integer coluna;
	
	public Position(Integer linha, Integer coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public Integer getLinha() {
		return linha;
	}

	public Integer getColuna() {
		return coluna;
	}

	public void setValues(Integer linha, Integer coluna) {
		this.linha = linha;
		this.coluna = coluna;

	}

	@Override
	public String toString() {
		return linha + "," + coluna;
	}
	
	
}
