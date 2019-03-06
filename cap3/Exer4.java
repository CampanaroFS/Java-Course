package cap3;

import javax.swing.JOptionPane;

public class Exer4 {
	public static void main(String[] args) {
		int valor, tabuada;
		
		String aux = JOptionPane.showInputDialog("Digite um número: ");
		valor = Integer.parseInt(aux);
		
		for(int i = 0; i <= 10; i++) {
			tabuada = valor * i;
			JOptionPane.showMessageDialog(null, valor + " * " + i + " = " + tabuada);
		}
	}

}
