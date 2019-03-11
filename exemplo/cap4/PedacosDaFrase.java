package exemplo.cap4;

import javax.swing.JOptionPane;

public class PedacosDaFrase {
	public static void main(String[] args) {
		try {
			String frase = JOptionPane.showInputDialog("Forneça uma frase");
			JOptionPane.showMessageDialog(null, "Frase: " + frase
					+ "\n(0,1): " + frase.substring(0, 1)
					+ "\n(3,8): " + frase.substring(3, 8)
					+ "\n(9, 11): " + frase.substring(9, 11)
					+ "\n(12, 14): " + frase.substring(12, 14));
		} catch(StringIndexOutOfBoundsException erro){
			JOptionPane.showMessageDialog(null, "A frase de ter pelo menos 15 caracteres \n" + erro.toString());
		}
		System.exit(0);
	}

}
