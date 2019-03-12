package cap5;

import javax.swing.JOptionPane;

public class Exer2 {
	public static void main(String[] args) {
		String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int indice;
		
		do {
			indice = (int) (Math.random() * 100);
		} while(indice > 12);
		
		JOptionPane.showMessageDialog(null, meses[indice]);
		
	}

}
