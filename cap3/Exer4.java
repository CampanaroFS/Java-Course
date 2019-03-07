package cap3;

import javax.swing.JOptionPane;
/**
 * Exercício 4 livro - Façã uma classe que apresente em tela a tabuada de qualquer número. O usuário fornece o número desejado e a classe apresenta a relação de todos os cálculos de 10 a 10. 
 * */
public class Exer4 {
	public static void main(String[] args) {
		int valor, tabuada;
		
		String aux = JOptionPane.showInputDialog("Digite um número: ");
		valor = Integer.parseInt(aux);
		
		for(int i = 0; i <= 10; i++) {
			tabuada = valor * i;
			JOptionPane.showMessageDialog(null, valor + " * " + i + " = " + tabuada);
		}
	}

}
