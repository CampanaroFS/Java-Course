package exemplo.cap4;

import javax.swing.JOptionPane;

public class RetirandoEspaços {
	public static void main(String[] args) {
		String novaFrase;
		String frase = JOptionPane.showInputDialog("Forneça uma frase");
		frase = "   " + frase + "   ";
		JOptionPane.showMessageDialog(null, 
				"\nCom espaços: " + "-" + frase + "-"
				+ "\nSem espaços: " + "-" + frase.trim() + "-");
		
		System.exit(0);
	}

}
