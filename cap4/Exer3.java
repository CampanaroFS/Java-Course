/**
 * Exerc�cio 3 livro - Crie uma classe que gera um npumero aleatoriamente (entre 5 e 10) por Math.random. Em seguida, fa�a com que apare�a em tela uma senha num�rica contendo a mesma quantidae de dig�tos
 * correspondentes ao valor aleat�rio gerado. Apresente em tela o n�mero sorteado e a senha.
 * */

package cap4;

import javax.swing.JOptionPane;

public class Exer3 {
	public static void main(String[] args) {
		String senha = "";
		int num;
		
		do {
			num = (int) (Math.random() * 10);
		} while(num < 5);
		
		for(int i = 0; i < num; i++) {
			int num2 = (int) (Math.random() * 10);
			senha += num2;
		}
		
		JOptionPane.showMessageDialog(null, "N�mero sorteado: " + num + "\nSenha Gerada: " + senha);
	}
}
