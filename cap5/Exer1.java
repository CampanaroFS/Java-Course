/**
 * Exercício 1 - Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, que armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente
 * (da maior para a menor) e a média aritmética das notas.
 */
package cap5;

import javax.swing.JOptionPane;

public class Exer1 {
	public static void main(String[] args) {
		double[] notas = new double[5];
		double media = 0.0;
		String n = "";
		for (int i = 0, j = 1; i < notas.length; i++, j++) {
			String nota = JOptionPane.showInputDialog("Digite a nota " + j);
			notas[i] += Double.parseDouble(nota);
		}

		for (int i = 0; i < notas.length; i++) {
			n += notas[i] + " ";
			media += notas[i];
		}
		media /= 5.0;

		JOptionPane.showMessageDialog(null, "As notas digitas são: " + n + "\nMédia final do aluno é: " + media);
	}

}
