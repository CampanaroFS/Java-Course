package exemplo.cap4;

import javax.swing.JOptionPane;

public class RetirandoEspa�os {
	public static void main(String[] args) {
		String novaFrase;
		String frase = JOptionPane.showInputDialog("Forne�a uma frase");
		frase = "   " + frase + "   ";
		JOptionPane.showMessageDialog(null, 
				"\nCom espa�os: " + "-" + frase + "-"
				+ "\nSem espa�os: " + "-" + frase.trim() + "-");
		
		System.exit(0);
	}

}
