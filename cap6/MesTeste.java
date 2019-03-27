package cap6;

import javax.swing.JOptionPane;

public class MesTeste {
	public static void main(String[] args) {
		String mes = Mes.getMesPorExtenso("Digite o mês: ");
		JOptionPane.showMessageDialog(null, "Mês: " + mes);
	}

}
