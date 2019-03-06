package cap02;

import javax.swing.JOptionPane;

public class Exer4 {

	public static void main(String[] args) {
		double prova1, prova2, trab;
		String aux;

		aux = JOptionPane.showInputDialog("Digite nota da prova 1");
		prova1 = Double.parseDouble(aux);

		aux = JOptionPane.showInputDialog("Digite nota da prova 2");
		prova2 = Double.parseDouble(aux);

		aux = JOptionPane.showInputDialog("Digite nota do trabalho");
		trab = Double.parseDouble(aux);

		double mediaFinal = (prova1 + prova2 + trab) / 3;
		System.out.println("Média final do aluno é: " + mediaFinal);

		if (mediaFinal >= 7.0) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
