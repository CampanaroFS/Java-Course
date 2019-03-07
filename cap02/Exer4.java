package cap02;

import javax.swing.JOptionPane;
/*
 * Exercício 4 livro - Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de duas provas e de um trabalho. Calcule e mostre a média e o resultado final (aprovado ou reporvado).
 * Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1) + nota da prova 2 + nota da prova 3 / 3. Considere que a média para aprovação é 7.0.
 * */
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
