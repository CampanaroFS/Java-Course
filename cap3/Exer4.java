package cap3;

import javax.swing.JOptionPane;
/**
 * Exerc�cio 4 livro - Fa�� uma classe que apresente em tela a tabuada de qualquer n�mero. O usu�rio fornece o n�mero desejado e a classe apresenta a rela��o de todos os c�lculos de 10 a 10. 
 * */
public class Exer4 {
	public static void main(String[] args) {
		int valor, tabuada;
		
		String aux = JOptionPane.showInputDialog("Digite um n�mero: ");
		valor = Integer.parseInt(aux);
		
		for(int i = 0; i <= 10; i++) {
			tabuada = valor * i;
			JOptionPane.showMessageDialog(null, valor + " * " + i + " = " + tabuada);
		}
	}

}
