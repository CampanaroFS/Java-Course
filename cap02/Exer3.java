package cap02;

import javax.swing.JOptionPane;

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
