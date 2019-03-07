package cap02;

import java.util.Scanner;
/*
 * Exercício 2 livro - Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros. O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro
 * de futebol. O segundo valor corresponde à quantidade de pontos do time lanterna. Considerando que cada vitória vale 3 pontos, elabore uma classe que calcule o número de vitórias necessárias para o time
 * lanterna alcance (ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de ponto fornecidas sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6.
 * */
public class Exer2 {

	public static void main(String[] args) {
		int lider;
		int lanterna;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite número de pontos do líder");
		lider = sc.nextInt();

		System.out.println("Digite número de pontos do lanterna");
		lanterna = sc.nextInt();

		int pontos = (lider - lanterna) / 3;
		// int valorUltrapassar = valor + 1;

		int v = pontos + lanterna;

		if (v >= lider) {
			int i = pontos * 3;

			if (i == lider) {
				System.out.print("Vitórias necessárias para alcançar é: " + pontos);
			} else {
				System.out.println("Vitórias necessárias para ultrapassar é: " + pontos);
			}
		} else {
			if (v < lider) {
				pontos += 1;
				System.out.println("Vitórias necessárias para ultrapassar é:" + pontos);
			}
		}

	}

}
