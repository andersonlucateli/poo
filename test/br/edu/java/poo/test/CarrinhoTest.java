package br.edu.java.poo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.java.poo.Carrinho;
import br.edu.java.poo.Categoria;
import br.edu.java.poo.Produto;

public class CarrinhoTest {
	@Test
	public void deveAdicionarProdutosCarrinho() {
		Produto produto1 = new Produto("Vassoura", 10.0, Categoria.OUTROS);
		Produto produto2 = new Produto("Budweiser", 5.0, Categoria.BEBIDA);
		Produto produto3 = new Produto("Camiseta", 50.0, Categoria.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 1);

		assertEquals(carrinho.getProdutos().get(0), produto1);
		assertEquals(carrinho.getProdutos().get(1), produto2);
		assertEquals(carrinho.getProdutos().get(2), produto3);
	}
	
	@Test
	public void deveConfirmarValorUnitario() {
		Produto produto1 = new Produto("Vassoura", 10.0, Categoria.OUTROS);
		Produto produto2 = new Produto("Budweiser", 5.0, Categoria.BEBIDA);
		Produto produto3 = new Produto("Camiseta", 50.0, Categoria.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 1);

		assertEquals(carrinho.getProdutos().get(0).getUnitario(), Double.valueOf(10.0));
		assertEquals(carrinho.getProdutos().get(1).getUnitario(), Double.valueOf(4.75));
		assertEquals(carrinho.getProdutos().get(2).getUnitario(), Double.valueOf(37.50));
	}
	
	@Test
	public void deveOrdenarProdutosCrescente() {
		Produto produto1 = new Produto("Vassoura", 10.0, Categoria.OUTROS);
		Produto produto2 = new Produto("Budweiser", 5.0, Categoria.BEBIDA);
		Produto produto3 = new Produto("Camiseta", 50.0, Categoria.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 1);
		
		carrinho.ordenarProdutosCrescente();
		
		assertEquals(carrinho.getProdutos().get(0), produto2);
		assertEquals(carrinho.getProdutos().get(1), produto1);
		assertEquals(carrinho.getProdutos().get(2), produto3);
	}
	
	@Test
	public void deveOrdenarProdutosDecrescente() {
		Produto produto1 = new Produto("Vassoura", 10.0, Categoria.OUTROS);
		Produto produto2 = new Produto("Budweiser", 5.0, Categoria.BEBIDA);
		Produto produto3 = new Produto("Camiseta", 50.0, Categoria.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 1);
		
		carrinho.ordenarProdutosDecrescente();
		
		assertEquals(carrinho.getProdutos().get(0), produto3);
		assertEquals(carrinho.getProdutos().get(1), produto1);
		assertEquals(carrinho.getProdutos().get(2), produto2);
	}
	
	@Test
	public void deveCalcularTotalCarrinho() {
		Produto produto1 = new Produto("Vassoura", 10.0, Categoria.OUTROS);
		Produto produto2 = new Produto("Budweiser", 5.0, Categoria.BEBIDA);
		Produto produto3 = new Produto("Camiseta", 50.0, Categoria.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 1);
		
		carrinho.calculaTotalCarrinho();
		
		assertEquals(carrinho.getTotal(), Double.valueOf(105.0));
	}
	
	@Test
	public void testDescontoBebida() {
		Produto produto1 = new Produto("Vassoura", 10.0, Categoria.OUTROS);
		Produto produto2 = new Produto("Budweiser", 5.0, Categoria.BEBIDA);
		Produto produto3 = new Produto("Camiseta", 50.0, Categoria.VESTUARIO);
		
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 10);
		carrinho.adicionaProduto(produto3, 1);
		
		carrinho.calculaTotalCarrinho();
		
		assertEquals(carrinho.getTotal(), Double.valueOf(105.0));
	}
}
