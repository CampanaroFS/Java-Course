package cap02;

import java.util.Scanner;
/*
 * Exerc�cio 2 livro - Usando a classe Scanner para entrada de dados, fa�a uma classe que receba dois valores inteiros. O primeiro valor corresponde � quantidade de pontos do l�der do campeonato brasileiro
 * de futebol. O segundo valor corresponde � quantidade de pontos do time lanterna. Considerando que cada vit�ria vale 3 pontos, elabore uma classe que calcule o n�mero de vit�rias necess�rias para o time
 * lanterna alcance (ou ultrapasse) o l�der. Por exemplo, supondo que as quantidades de ponto fornecidas sejam 40 e 22, ent�o o n�mero de vit�rias apresentada na sa�da dever� ser 6.
 * */
public class Exer2 {

	public static void main(String[] args) {
		int lider;
		int lanterna;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite n�mero de pontos do l�der");
		lider = sc.nextInt();

		System.out.println("Digite n�mero de pontos do lanterna");
		lanterna = sc.nextInt();

		int pontos = (lider - lanterna) / 3;
		// int valorUltrapassar = valor + 1;

		int v = pontos + lanterna;

		if (v >= lider) {
			int i = pontos * 3;

			if (i == lider) {
				System.out.print("Vit�rias necess�rias para alcan�ar �: " + pontos);
			} else {
				System.out.println("Vit�rias necess�rias para ultrapassar �: " + pontos);
			}
		} else {
			if (v < lider) {
				pontos += 1;
				System.out.println("Vit�rias necess�rias para ultrapassar �:" + pontos);
			}
		}

	}

}
