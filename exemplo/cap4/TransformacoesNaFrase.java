package exemplo.cap4;

import javax.swing.JOptionPane;

public class TransformacoesNaFrase {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Forne�a uma frase");
		JOptionPane.showMessageDialog(null, "Frase: " + frase
				+ "\nTodas em Mai�sculas: " + frase.toUpperCase()
				+ "\nTodas em Min�sculas: " + frase.toLowerCase());
		
		String resp = JOptionPane.showInputDialog("Voc� � homem?");
		if(resp.equalsIgnoreCase("sim")) { // Qualquer forma que for digitar "sim", o m�todo ignorar�. 
			JOptionPane.showMessageDialog(null, "Voc� provavelmente n�o est� dizendo a verdade!");
		}
		System.exit(0);
	}

}
