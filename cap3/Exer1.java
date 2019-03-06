package cap3;

import javax.swing.JOptionPane;

public class Exer1 {
	public static void main(String[] args) {
		try {
			String aux, nome;
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
			JOptionPane.showMessageDialog(null, "Produto: " + nome + "\npreco original: " + preco + "\nPreco com desconto: " + precoComDesconto);
			} else {
				JOptionPane.showMessageDialog(null, "   Operação cancelada.\nValor digitado é menor que 0.");
			}

		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());

		} finally {
			JOptionPane.showMessageDialog(null, "Fim da execução!");
		}
		System.exit(0);
	}

}
