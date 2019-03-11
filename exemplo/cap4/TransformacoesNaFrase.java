package exemplo.cap4;

import javax.swing.JOptionPane;

public class TransformacoesNaFrase {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Forneça uma frase");
		JOptionPane.showMessageDialog(null, "Frase: " + frase
				+ "\nTodas em Maiúsculas: " + frase.toUpperCase()
				+ "\nTodas em Minúsculas: " + frase.toLowerCase());
		
		String resp = JOptionPane.showInputDialog("Você é homem?");
		if(resp.equalsIgnoreCase("sim")) { // Qualquer forma que for digitar "sim", o método ignorará. 
			JOptionPane.showMessageDialog(null, "Você provavelmente não está dizendo a verdade!");
		}
		System.exit(0);
	}

}
