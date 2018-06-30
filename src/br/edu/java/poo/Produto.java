package br.edu.java.poo;

public class Produto {

	private String nome;
	private Double unitario;
	private int quantidade;
	private Categoria categoria;
	
	public Produto(String nome, Double unitario, Categoria categoria ) {
		super();
		this.nome = nome;
		this.unitario = unitario;
		this.categoria = categoria;
	}

	public Double calcularDesconto() {
		this.unitario = getCategoria().calcularDesconto(this);
		return unitario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getUnitario() {
		return unitario;
	}

	public void setUnitario(Double unitario) {
		this.unitario = unitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
