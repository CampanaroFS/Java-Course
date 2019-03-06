package cap02;

import java.io.*; // o Asterisco representa todas as classes do import java.io

public class Exer1 {
	
	public static void main(String[] args) {
		String produto;
		String p;
		double valor;
		double porcentagem;
		
		BufferedReader prod;
		
		try {
		System.out.println("Digite o nome do produto");
		prod = new BufferedReader(new InputStreamReader(System.in));
		produto = prod.readLine();
		
		System.out.println("Digite o valor");
		prod = new BufferedReader(new InputStreamReader(System.in));
		p = prod.readLine();
		valor = Double.parseDouble(p);
		
		System.out.println("Digite a porcentagem");
		prod = new BufferedReader(new InputStreamReader(System.in));
		p = prod.readLine();
		porcentagem = Double.parseDouble(p);
		
		double total = valor * porcentagem;
		total = valor - total;
		System.out.printf("Produto %s tem valor R$%f\n", produto, valor);
		System.out.printf("Novo valor com desconto: R$%f", total);
		
	
		} catch (IOException erro){
			System.out.println("Erro de conversão");
		}
	}

}
