package exemplo.cap4;

import javax.swing.JOptionPane;

public class MostraLetras {
	public static void main(String[] args) throws InterruptedException {
		String palavra = JOptionPane.showInputDialog("Forne�a uma palavra");
		/*for(int i = 0; i <= palavra.length(); i++) {
			char c = palavra.charAt(i);
			System.out.print(c);
			Thread.sleep(1000);
		}*/
		System.out.println();
		for(int i = palavra.length() - 1; i >= 0; i--) {
			char c = palavra.charAt(i);
			System.out.print(c);
			Thread.sleep(1000);
		}
	}

}
