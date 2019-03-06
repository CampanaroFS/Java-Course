package cap3;

import javax.swing.JOptionPane;

public class Exer5 {
	public static void main(String[] args) {
		String aux;
		int exer;

		Exer1 exer1 = new Exer1();

		aux = (String) JOptionPane.showInputDialog(
				"Digite uma op��o: \n1 - Exerc�cio 1\n2 - Exerc�cio 2\n3 - Exerc�cio 3\n4 - Exerc�cio 4");

		if (aux != null) {
			switch (aux) {
			case "1":
				try {
					String aux1, nome;
					double preco, desconto = 0, precoComDesconto;
					aux = JOptionPane.showInputDialog("Digite o nome do produto");
					nome = aux;

					aux = JOptionPane.showInputDialog("Digite o valor do referido produto");
					preco = Double.parseDouble(aux);

					if (preco >= 0) {
						if (preco >= 50 && preco < 200) {
							desconto = 5.0;
						} else {
							if (preco >= 200 && preco < 500) {
								desconto = 6.0;
							} else {
								if (preco >= 500 && preco < 1000) {
									desconto = 7.0;
								} else {
									if (preco == 1000) {
										desconto = 8.0;
									}
								}
							}
						}

						precoComDesconto = preco - ((preco * desconto) / 100);
						JOptionPane.showMessageDialog(null, "Produto: " + nome + "\npreco original: " + preco
								+ "\nPreco com desconto: " + precoComDesconto);
					} else {
						JOptionPane.showMessageDialog(null, "   Opera��o cancelada.\nValor digitado � menor que 0.");
					}

				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, erro.getMessage());

				} finally {
					JOptionPane.showMessageDialog(null, "Fim da execu��o!");
				}
				break;

			case "2":
				String aux2;
				int res1, res2, res3, res4, resEqu, maiorRes, menorRes;
				aux2 = JOptionPane.showInputDialog("Digite o valor da resist�ncia 1");
				res1 = Integer.parseInt(aux2);
				aux2 = JOptionPane.showInputDialog("Digite o valor da resist�ncia 2");
				res2 = Integer.parseInt(aux2);
				aux2 = JOptionPane.showInputDialog("Digite o valor da resist�ncia 3");
				res3 = Integer.parseInt(aux2);
				aux2 = JOptionPane.showInputDialog("Digite o valor da resist�ncia 4");
				res4 = Integer.parseInt(aux2);

				resEqu = res1 + res2 + res3 + res4;

				if (res1 > res2) {
					maiorRes = res1;
					menorRes = res2;
				} else {
					maiorRes = res2;
					menorRes = res1;
				}
				if (res3 > res4) {
					if (res3 > maiorRes) {
						maiorRes = res3;
					}

				} else {
					if (res4 > maiorRes) {
						maiorRes = res4;
					}
				}
				if (res3 < menorRes) {
					menorRes = res3;
				}
				if (res4 < menorRes) {
					menorRes = res4;
				}
				JOptionPane.showMessageDialog(null,
						"Resist�ncias fornecidas: \n" + res1 + ", " + res2 + ", " + res3 + ", " + res4
								+ "\nResist�ncia equivalente = " + resEqu + "\nMaior Resist�ncia = " + maiorRes
								+ "\nMenor Resist�ncia = " + menorRes);
				break;

			case "3":
				try {
					String login = "java", aux3, aux1;
					int password = 123, aux4;

					for (int i = 2; i >= 0; i--) {
						aux3 = JOptionPane.showInputDialog("Forne�a um login: ");

						aux1 = JOptionPane.showInputDialog("Forna a senha: ");
						aux4 = Integer.parseInt(aux1);

						if (login.equals(aux3) && aux4 == password) {
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

				break;
			case "4":
				int valor, tabuada;

				String aux5 = JOptionPane.showInputDialog("Digite um n�mero: ");
				valor = Integer.parseInt(aux5);

				for (int i = 0; i <= 10; i++) {
					tabuada = valor * i;
					JOptionPane.showMessageDialog(null, valor + " * " + i + " = " + tabuada);
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o n�o existe!");
			}
		}

		System.exit(0);
	}
}
