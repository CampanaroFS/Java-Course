package cap6;

import javax.swing.JOptionPane;

public class DataTeste {
	public static void main(String[] args) {
		int d = Data.getDia("23", "13", "1990");
		int m = Data.getMes("23", "04", "1990");
		int a = Data.getAno("23", "04", "2020");
		
		JOptionPane.showMessageDialog(null, "Dia: " + d + "\nMês: " + m + "\nAno: " + a);
		
	}

}
