package cap3;

import javax.swing.JOptionPane;
/**
 * Na �rea de eketr�nica, em um circuito em s�rie emos que a resist�ncia equivalente (total) desse circuito obtida mediante a soma de todas as resist�nciase existentes (RE = r1 + r2 + ... + rn).
 * Fa�� uma classe que receba o valor de quatro resist�ncias ligadas em s�rie, calcule e mostre a resist�ncia equivalente, a maior e a menor resist�ncia.
 */
public class Exer2 {
	public static void main(String[] args) {

		String aux;
		int res1, res2, res3, res4, resEqu, maiorRes, menorRes;

		aux = JOptionPane.showInputDialog("Digite o valor da resist�ncia 1");
		res1 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog("Digite o valor da resist�ncia 2");
		res2 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog("Digite o valor da resist�ncia 3");
		res3 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog("Digite o valor da resist�ncia 4");
		res4 = Integer.parseInt(aux);

		resEqu = res1 + res2 + res3 + res4;

		if (res1 > res2) {
			maiorRes = res1;
			menorRes = res2;
		} else {
			maiorRes = res2;
			menorRes = res1;
		}
		if (res3 > res4) {
			if (res3 > maiorRes) {
				maiorRes = res3;
			}

		} else {
			if (res4 > maiorRes) {
				maiorRes = res4;
			}
		}
		if(res3 < menorRes) {
			menorRes = res3;
		} 
		if(res4 < menorRes) {
			menorRes = res4;
		}
		
		JOptionPane.showMessageDialog(null, "Resist�ncias fornecidas: \n" + res1 + "," + res2 + "," + res3 + "," + res4 + "\nResist�ncia equivalente = " + resEqu + "\nMaior Resist�ncia = " + maiorRes
				+ "\nMenor Resist�ncia = " + menorRes);
	}

}
