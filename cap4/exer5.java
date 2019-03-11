/**
 * Elabore uma classe que receba uma frase e verifique se essa frase possui palavras impróprias. As palavras impróprias são: sexo e sexual. Caso encontre uma dessas palavras, emita em tela a mensagem 
 * "Conteúdo Impróprio", caso contrário "Conteúdo Liberado".
 * */

package cap4;

import javax.swing.JOptionPane;

public class exer5 {
	public static void main(String[] args) {
		String frase = "", fraseImp1 = "sexo", fraseImp2 = "sexual";
		
		frase = JOptionPane.showInputDialog("Forneça uma frase");
		
		if(frase.toLowerCase().indexOf("sexo") != -1 || frase.toLowerCase().indexOf("sexual") != -1) {
			JOptionPane.showMessageDialog(null, "Conteúdo Impróprio!");
			} else {
				JOptionPane.showMessageDialog(null, "Conteúdo Liberado!");
				}
		
		System.exit(0);
		}

}
