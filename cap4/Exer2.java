/**
 * Exercício 2 livro - Uma farmácia precisa ajustas os preços de seus produtos em 12%. Elabore uma classe que receba o valor do produto e aplique o percentual de acréscimo. O novo valor a ser calculado deve ser
 * arredondado para mais ou para menos usando o método round. A classe deve também conter um laço de repetição que encerre o programa quando o usuário fornecer o valor zero (0) para o valor do produto. Dessa
 * forma, o usuário digita o valor do produto, a classe calcula e mostra o valor com acréscimo, a seguir solicita um novo valor. Esse processo continua enquanto o valor do produto for diferente de zero;
 * caso contrário o programa será encerrado.
 * */

package cap4;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exer2 {
	public static void main(String[] args) {
		double price, percentage = 12.0, totalPrice;
		String aux;
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ 00.00");
		
		do {
		aux = JOptionPane.showInputDialog("Digite o preço do produto");
		price = Double.parseDouble(aux);
		
		if(price != 0.0) {
		totalPrice = price + (price * percentage) / 100;
		
		JOptionPane.showMessageDialog(null, "Valor com acrescimo é: " + df.format(totalPrice) + "\nValor Arredondado: " + df.format(Math.round(totalPrice)));
		}
		} while(price != 0);
		
		System.exit(0);
		
	}

}
