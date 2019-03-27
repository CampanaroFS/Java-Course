/**
 * Exerc�cio 4 livro - Fa�a uma classe contendo dois arrays do tipo inteiro, um chamado par e outro chamado �mpar. Cada array deve conter 10 elementos.
 * A seguir, fa�a um la�o de repeti��o com 10 itera��es e que contenha internamente a gera��o rand�mica de n�meros entre 1 a 20. Se i valor gerado for par, armazene no array chamado par, caso
 * contr�rio, no array chamado impar. Ao final, apresente o conte�do de cada um dos arrays.
 * */

package cap5;

import java.util.Arrays;

public class Exer4 {
	public static void main(String[] args) {
		int[] par = new int[10];
		int[] impar = new int[10];
		int valor;
		
		for(int i = 0; i < 10; i++) {
			do {
				valor = (int) (Math.random() * 100);
			} while (valor > 20);
			
			if(valor % 2 == 0) {
					par[i] = valor;
			} else {
					impar[i] = valor;
			}
			
		}
		
		System.out.println("\nPar: ");
		for(int y = 0; y < par.length; y++) {
			System.out.println("[" + y + "] = " + par[y]);
		}
		
		System.out.println("\n�mpar: ");
		for(int z = 0; z < impar.length; z++) {
			System.out.println("[" + z + "] = " + impar[z]);
		}

	}
}