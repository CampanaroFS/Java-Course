package cap02;

import java.util.Scanner;

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
