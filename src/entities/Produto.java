package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
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
		return nome +", $ " + preco + ", TOTAL: $" + totalValorEstoque();
	}

}
