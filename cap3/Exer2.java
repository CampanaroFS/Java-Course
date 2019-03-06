package cap3;

import javax.swing.JOptionPane;

public class Exer2 {
	public static void main(String[] args) {

		String aux;
		int res1, res2, res3, res4, resEqu, maiorRes, menorRes;

		aux = JOptionPane.showInputDialog("Digite o valor da resistência 1");
		res1 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog("Digite o valor da resistência 2");
		res2 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog("Digite o valor da resistência 3");
		res3 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog("Digite o valor da resistência 4");
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
		
		JOptionPane.showMessageDialog(null, "Resistências fornecidas: \n" + res1 + "," + res2 + "," + res3 + "," + res4 + "\nResistência equivalente = " + resEqu + "\nMaior Resistência = " + maiorRes
				+ "\nMenor Resistência = " + menorRes);
	}

}
