/** Exerc�cio 1 livro - Crie uma classe que simule a jogada de um dado de seis lados (�meros de 1 a 6) por tr�s vezes. Ao final some seus valores e apresente o resultado das tr�s jogadas. Veja 
 * o resultado das tr�s jogadas.*/

package cap4;

import javax.swing.JOptionPane;

public class Exer1 {
	public static void main(String[] args) {
		String aux, x = "";

		int i = 0, total = 0;

		while (i < 3) {
				int num = 0;

				do {
					num = (int) (Math.random() * 10);
				} while (num > 6);
				total += num;
				x += num + "\n";
			i++;
		}
		JOptionPane.showMessageDialog(null, "N�meros sorteados: \n" + x + "Total = " + total);
		
		System.exit(0);
	}

}
