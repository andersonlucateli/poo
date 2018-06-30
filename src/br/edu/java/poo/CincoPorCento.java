package br.edu.java.poo;

public class CincoPorCento implements RegraDesconto{

	@Override
	public Double calcularDesconto(Produto produto) {
		return produto.getUnitario() * 0.95;
	}

	
}
