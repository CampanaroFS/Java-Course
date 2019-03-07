package cap3;

import javax.swing.JOptionPane;
/*
 * Exercício 1 livro - Usando JoptionPane, elabore uma classe que receba o nome de um produto e o seu valor. O desconto deve ser calculado de acordo com o valor fornecido conforme a tabela. Utilizando a estrutura
 * if-else, apresente e tela o nome do produto, valor original do produto e o novo valor depois de ser realizado o desconto. Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
 * 
 * >= 50 e < 200 = 5%
 * >=200 e < 500 = 6%
 * >= 500 e < 100 = 7%
 * <= 1000 = 8%
 * */
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
