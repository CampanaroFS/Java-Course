/**
 * Exercício 2 livro - Crie uma classe que armazene os 12 meses do ano em um array. A seguir, gere um valor randômico entre 0 a 11 e apresente o mês correspondente ao valor sorteado. Considere que o valor 0 corresponde
 * ao mês de janeiro e o valor 11, ao mês de dezembro
 * */
package cap5;

import javax.swing.JOptionPane;

public class Exer2 {
	public static void main(String[] args) {
		String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int indice;
		
		do {
			indice = (int) (Math.random() * 100);
		} while(indice > 12);
		
		JOptionPane.showMessageDialog(null, meses[indice]);
		
	}

}
