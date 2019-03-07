package cap3;

import javax.swing.JOptionPane;
/**
 * Exerc�cio 3 livro - Fa�a uma classe que solicite login e senha, simulando o acesso a um sistema. Considere que os conte�dos de login e senha originais s�o iguais a "java". O usu�rio dever� fornecer login e senha
 * e vor� ir� compar�-los com os conte�dos originais. O usu�rio tem tr�s chances para digitar corretamente os dados de login e senha. Para cada tentativa incorreta deve aparecer uma mensagem alertando o erro e
 * apresentando a quantidade de tentativas que ainda restam.
 * */
public class Exer3 {
	public static void main(String[] args) {
		try {
			String login = "java", aux, aux1;
			int password = 123, aux2;

			for (int i = 2; i >= 0; i--) {
				aux = JOptionPane.showInputDialog("Forne�a um login: ");

				aux1 = JOptionPane.showInputDialog("Forna a senha: ");
				aux2 = Integer.parseInt(aux1);

				if (login.equals(aux) && aux2 == password) {
					JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Falha, verifique login e senha!\nVoc� tem mais " + i + " tentativas(s)!");
				}

			}

		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digit apenas valores inteiros\n" + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		} finally {
			JOptionPane.showMessageDialog(null, "Fim da execu��o!");
		}

	}
}
