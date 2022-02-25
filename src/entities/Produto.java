package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
	}
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	} // construtores
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	
	// metodos
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int entredaNaQuantidade) {
		quantidade += entredaNaQuantidade;
	}
	
	public void removerProdutos(int saidaDeQuantidade) {
		quantidade -= saidaDeQuantidade;
	}
	
	public String toString() {
		return quantidade
				+ " unidades, "
				+ nome 
				+ ", $ " 
				+ String.format("%.2f" , preco) 
				+ ", TOTAL: $ " + String.format("%.2f" , totalValorEstoque());
	}
	
}
