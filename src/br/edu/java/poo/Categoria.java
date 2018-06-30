package br.edu.java.poo;

public enum Categoria {
	
	BEBIDA(new CincoPorCento()),
	VESTUARIO(new VinteCincoPorCento()),
	OUTROS(new ZeroPorCento());
	
	private RegraDesconto regraDesconto;

	Categoria(RegraDesconto regraDesconto) {
		this.regraDesconto = regraDesconto;
	}
	
	Double calcularDesconto(Produto produto) {
		return regraDesconto.calcularDesconto(produto);
	}
}
