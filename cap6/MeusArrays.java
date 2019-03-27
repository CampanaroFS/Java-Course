package cap6;

import javax.swing.JOptionPane;

public class MeusArrays {
	public static void pesquiseNumero() {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 22 };
		int[] array2 = { 1, 12, 13, 14, 15, 16, 17, 18, 19, 22 };
		int numero = 0;
		int retorno = 0;

		String aux = JOptionPane.showInputDialog("Digite um numero: ");
		numero = Integer.parseInt(aux);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == numero) {
				retorno = 1;
				break;
			}
		}
		for (int y = 0; y < array2.length; y++) {
			if (array2[y] == numero) {
				retorno += 1;
			}
		}
		JOptionPane.showMessageDialog(null, "Existe em: " + retorno + " array(s)");
	}

	public static void gerarArray(int n) {
		int[] array = new int[n];
		int i = 0;
		while (i < array.length) {
			array[i] = (int) (Math.random() * 1000);
			i++;
		}
		for (int z = 0; z < array.length; z++) {
			System.out.println("[" + z + "] = " + array[z]);
		}
	}
}
