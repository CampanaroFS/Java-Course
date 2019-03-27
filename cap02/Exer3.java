package cap02;

import javax.swing.JOptionPane;
/*
 * O imposto sobre a transmiss�o de bens m�veis (ITBI) � aplicado sobre o valor de um im�vel a ser negociado. A base de c�lculo do ITBI (o valor a ser considerado no c�lculo) ser� o maior 
 * valor entre o valor de transa��o (o valor negociado) e o valor venal de ref�rencia (fornecido pela prefeitura). Com base nisso, elabore uma classe que receba o valor da transa��o, o valor venal
 * e o percentual de imposto. Ap�s isso, encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente o valor do imposto a ser pago. Observa��o: o valor do imposto a ser pago � calculado por meio da f�rmula:
 * valor do imposto = maior valor * percentual / 100. Para entrada e sa�da de dados utilize a classe JOptionPane.
 * */
public class Exer3 {

	public static void main(String[] args) {
		String aux;
		double valorNegociado, valorVenal, percentual, maiorValor, imposto;

		aux = JOptionPane.showInputDialog("Digite o valor a ser negociado do im�vel");
		valorNegociado = Double.parseDouble(aux);

		aux = JOptionPane.showInputDialog("Digite o valor venal do im�vel");
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
