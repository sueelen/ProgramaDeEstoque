package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Quantidade no estoque." + produto.toString());
		
		System.out.println("Adicione produtos ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println("Atualização do estoque." + produto.toString());
		
		System.out.println("Remova produtos ao estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("Atualização do estoque." + produto.toString());
		
		sc.close();
	}
}
