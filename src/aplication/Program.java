package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Pre?o: ");
		double preco = sc.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		
		System.out.println("DADOS: " + produto.toString());
		
		System.out.println("Adicione produtos ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println("Atualiza??o do estoque: " + produto.toString());
		
		System.out.println("Remova produtos ao estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("Atualiza??o do estoque: " + produto.toString());
		
		sc.close();
	}
}
