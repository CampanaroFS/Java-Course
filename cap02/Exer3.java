package cap02;

import javax.swing.JOptionPane;
/*
 * O imposto sobre a transmissão de bens móveis (ITBI) é aplicado sobre o valor de um imóvel a ser negociado. A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior 
 * valor entre o valor de transação (o valor negociado) e o valor venal de refêrencia (fornecido pela prefeitura). Com base nisso, elabore uma classe que receba o valor da transação, o valor venal
 * e o percentual de imposto. Após isso, encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente o valor do imposto a ser pago. Observação: o valor do imposto a ser pago é calculado por meio da fórmula:
 * valor do imposto = maior valor * percentual / 100. Para entrada e saída de dados utilize a classe JOptionPane.
 * */
public class Exer3 {

	public static void main(String[] args) {
		String aux;
		double valorNegociado, valorVenal, percentual, maiorValor, imposto;

		aux = JOptionPane.showInputDialog("Digite o valor a ser negociado do imóvel");
		valorNegociado = Double.parseDouble(aux);

		aux = JOptionPane.showInputDialog("Digite o valor venal do imóvel");
		valorVenal = Double.parseDouble(aux);

		aux = JOptionPane.showInputDialog("Digite percentual do imposto");
		percentual = Double.parseDouble(aux);

		if (valorNegociado > valorVenal) {
			maiorValor = valorNegociado;
			imposto = (maiorValor * percentual) / 100;
		} else {
			maiorValor = valorVenal;
			imposto = (maiorValor * percentual) / 100;
		}

		System.out.println("Valor do imposto a ser pago: R$" + imposto);

	}

}
