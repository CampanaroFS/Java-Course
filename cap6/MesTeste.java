package cap6;

import javax.swing.JOptionPane;

public class MesTeste {
	public static void main(String[] args) {
		String mes = Mes.getMesPorExtenso("Digite o m�s: ");
		JOptionPane.showMessageDialog(null, "M�s: " + mes);
	}

}
