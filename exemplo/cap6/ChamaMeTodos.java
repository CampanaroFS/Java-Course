package exemplo.cap6;

import javax.swing.JOptionPane;

public class ChamaMeTodos {
	public static void main(String[] args) {
		String nome = EntradaDeDadosComMetodos.lerString("Forne�a seu nome");
		int idade = EntradaDeDadosComMetodos.lerNumeroInt(0, 120, "Forne�a sua idade");
		float altura = EntradaDeDadosComMetodos.lerNumeroFloat(0, 2.5f, "Forne�a sua altura");
		double peso = EntradaDeDadosComMetodos.lerNumeroDouble(0, 300, "Forne�a seu peso");
		char op = EntradaDeDadosComMetodos.selecionarOpcao("Voc� gosta de Java");
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade
				+ "\nAltura: " + altura + "\nPeso: " + peso + "\nOp��o selecionada: " + op);
	}

}
