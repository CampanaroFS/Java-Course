package cap3;

import javax.swing.JOptionPane;

public class Exer3 {
	public static void main(String[] args) {
		try {
			String login = "java", aux, aux1;
			int password = 123, aux2;

			for (int i = 2; i >= 0; i--) {
				aux = JOptionPane.showInputDialog("Forneça um login: ");

				aux1 = JOptionPane.showInputDialog("Forna a senha: ");
				aux2 = Integer.parseInt(aux1);

				if (login.equals(aux) && aux2 == password) {
					JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Falha, verifique login e senha!\nVocê tem mais " + i + " tentativas(s)!");
				}

			}

		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digit apenas valores inteiros\n" + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		} finally {
			JOptionPane.showMessageDialog(null, "Fim da execução!");
		}

	}
}
