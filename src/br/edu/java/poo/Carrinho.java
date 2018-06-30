package br.edu.java.poo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrinho {

	private List<Produto> produtos;
	private Double total = 0.0;

	public Carrinho() {

	}

	public void adicionaProduto(Produto produto, int quantidade) {
		if (produtos == null) {
			produtos = new ArrayList<>();
		}
		produto.setQuantidade(quantidade);
		produto.calcularDesconto();
		produtos.add(produto);
	}
	
	public void ordenarProdutosCrescente() {
		produtos.sort(Comparator.comparing(Produto::getUnitario));
	}
	
	public void ordenarProdutosDecrescente() {
		produtos.sort(Comparator.comparing(Produto::getUnitario).reversed());
	}
	
	public void calculaTotalCarrinho() {
		total = 0.0;
		for (Produto produto : produtos) {
			total += produto.getUnitario() * produto.getQuantidade();
		}
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Double getTotal() {
		return total;
	}

}
