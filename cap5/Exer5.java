/**
 * Exerc�cio 5 livro - Usando um array unidimensional de 10 elementos do tipo String, fa�a uma classe que simule a ocupa��o de um estacionamento de veiculos. Considere que a posi��o do array corresponde ao 
 * n�mero da vaga e para cada vaga � armazenada a placa do ve�culo que est� estacionado. Sua classe deve conter um la�o de repeti��o simulando um menu que controle a entrada e a sa�da dos ve�culos com as op��es:
 * 1-Entrada, 2-Sa�da, 3-Lista situa��o atual e 4-Encerrar o programa. Se o usu�rio escolher 1, solicite o n�mero da vaga e a placa do ve�culo; se escolher 2, solicite o n�mero da vaga que ser� liberada e armazene
 * o valor branco na posi��o correspondente ao array; se escolher 3, liste a situa��o atual apesentado em tela todos os elementos do array; quando for 4, encerre o la�o e o programa.
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
					.showInputDialog(null, "Digite uma op��o: \n1 - Entrada\n2 - Sa�da\n3 - Listar\n4 - Encerrar\n");
			int b = Integer.parseInt(aux);
			
			if(b < 1 || b > 4) {
				throw new Exception("Op��o digitada errada!!");
			}
			if (aux != null) {
				switch (aux) {
				case "1":
					aux = JOptionPane.showInputDialog("Digite n�mero da vaga: ");
					int i = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite n�mero da placa: ");
					numVagas[i] = aux;
					break;
				case "2":
					aux = JOptionPane.showInputDialog("Digite n�mero da vaga a ser liberada: ");
					int j = Integer.parseInt(aux);
					
					numVagas[j] = "vago";
					break;
				case "3":
					JOptionPane.showMessageDialog(null,
							"Situa��o atual:\n " + "0 - " + numVagas[0] + "\n" + "1 - " + numVagas[1] + "\n" + "2 - " + numVagas[2] + "\n"
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
			JOptionPane.showMessageDialog(null, "Fim de execu��o!");
		}
		System.exit(0);
	}
}
