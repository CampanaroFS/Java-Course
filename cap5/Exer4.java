/**
 * Exercício 4 livro - Faça uma classe contendo dois arrays do tipo inteiro, um chamado par e outro chamado ímpar. Cada array deve conter 10 elementos.
 * A seguir, faça um laço de repetição com 10 iterações e que contenha internamente a geração randômica de números entre 1 a 20. Se i valor gerado for par, armazene no array chamado par, caso
 * contrário, no array chamado impar. Ao final, apresente o conteúdo de cada um dos arrays.
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
		
		System.out.println("\nÍmpar: ");
		for(int z = 0; z < impar.length; z++) {
			System.out.println("[" + z + "] = " + impar[z]);
		}

	}
}