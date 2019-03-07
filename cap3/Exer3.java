package cap3;

import javax.swing.JOptionPane;
/**
 * Exercício 3 livro - Faça uma classe que solicite login e senha, simulando o acesso a um sistema. Considere que os conteúdos de login e senha originais são iguais a "java". O usuário deverá fornecer login e senha
 * e vorê irá compará-los com os conteúdos originais. O usuário tem três chances para digitar corretamente os dados de login e senha. Para cada tentativa incorreta deve aparecer uma mensagem alertando o erro e
 * apresentando a quantidade de tentativas que ainda restam.
 * */
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
