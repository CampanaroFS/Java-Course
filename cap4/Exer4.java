/**Exerc�cio 4 livro - Construa uma classe que receba uma frase qualquer e mostre essa frase de tr�s para a frente sem espa�os em branco.
	*/
package cap4;

import javax.swing.JOptionPane;

public class Exer4 {
	public static void main(String[] args) {
		String frase = "", fraseFinal = "";
		
		frase = JOptionPane.showInputDialog("Digite uma frase:");
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			char c = frase.charAt(i);
			fraseFinal += c;
		}
		JOptionPane.showMessageDialog(null, "Frase fornecida: " + frase + "\nFrase de tr�s para frente: " + fraseFinal.trim().replace(" ", ""));
	}

}
