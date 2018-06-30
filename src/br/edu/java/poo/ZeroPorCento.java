package br.edu.java.poo;

public class ZeroPorCento implements RegraDesconto{

	@Override
	public Double calcularDesconto(Produto produto) {
		return produto.getUnitario();
	}

}
