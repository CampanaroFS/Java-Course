/**
 * Exercício 5 livro - Usando um array unidimensional de 10 elementos do tipo String, faça uma classe que simule a ocupação de um estacionamento de veiculos. Considere que a posição do array corresponde ao 
 * número da vaga e para cada vaga é armazenada a placa do veículo que está estacionado. Sua classe deve conter um laço de repetição simulando um menu que controle a entrada e a saída dos veículos com as opções:
 * 1-Entrada, 2-Saída, 3-Lista situação atual e 4-Encerrar o programa. Se o usuário escolher 1, solicite o número da vaga e a placa do veículo; se escolher 2, solicite o número da vaga que será liberada e armazene
 * o valor branco na posição correspondente ao array; se escolher 3, liste a situação atual apesentado em tela todos os elementos do array; quando for 4, encerre o laço e o programa.
 * */
package cap5;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Exer5 {
	public static void main(String[] args)  throws IOException {
		String[] numVagas = new String[10];
		int flag = 0;
		
		for(int q = 0; q < numVagas.length; q++) {
			numVagas[q] = "vago";
		}
	
		try {
		while (flag == 0) {
			String aux = (String) JOptionPane
					.showInputDialog(null, "Digite uma opção: \n1 - Entrada\n2 - Saída\n3 - Listar\n4 - Encerrar\n");
			int b = Integer.parseInt(aux);
			
			if(b < 1 || b > 4) {
				throw new Exception("Opção digitada errada!!");
			}
			if (aux != null) {
				switch (aux) {
				case "1":
					aux = JOptionPane.showInputDialog("Digite número da vaga: ");
					int i = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite número da placa: ");
					numVagas[i] = aux;
					break;
				case "2":
					aux = JOptionPane.showInputDialog("Digite número da vaga a ser liberada: ");
					int j = Integer.parseInt(aux);
					
					numVagas[j] = "vago";
					break;
				case "3":
					JOptionPane.showMessageDialog(null,
							"Situação atual:\n " + "0 - " + numVagas[0] + "\n" + "1 - " + numVagas[1] + "\n" + "2 - " + numVagas[2] + "\n"
									+ "3 - " + numVagas[3] + "\n" + "4 - " + numVagas[4] + "\n" + "5 - " + numVagas[5] + "\n" + "6 - " + numVagas[6] + "\n"
									+ "7 - " + numVagas[7] + "\n" + "8 - " + numVagas[8] + "\n" + "9 - " + numVagas[9]);
					break;
				case "4":
					flag = 1;
					break;
				}
			}
		}

		} catch(Exception erro){
			JOptionPane.showMessageDialog(null, erro.toString());
		} finally {
			JOptionPane.showMessageDialog(null, "Fim de execução!");
		}
		System.exit(0);
	}
}
