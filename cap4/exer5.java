/**
 * Elabore uma classe que receba uma frase e verifique se essa frase possui palavras impr�prias. As palavras impr�prias s�o: sexo e sexual. Caso encontre uma dessas palavras, emita em tela a mensagem 
 * "Conte�do Impr�prio", caso contr�rio "Conte�do Liberado".
 * */

package cap4;

import javax.swing.JOptionPane;

public class exer5 {
	public static void main(String[] args) {
		String frase = "", fraseImp1 = "sexo", fraseImp2 = "sexual";
		
		frase = JOptionPane.showInputDialog("Forne�a uma frase");
		
		if(frase.toLowerCase().indexOf("sexo") != -1 || frase.toLowerCase().indexOf("sexual") != -1) {
			JOptionPane.showMessageDialog(null, "Conte�do Impr�prio!");
			} else {
				JOptionPane.showMessageDialog(null, "Conte�do Liberado!");
				}
		
		System.exit(0);
		}

}
