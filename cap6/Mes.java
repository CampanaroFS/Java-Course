package cap6;

import javax.swing.JOptionPane;

public class Mes {
	static String aux = "";

	public static String getMesPorExtenso(String men1) {
		String value = "";
		try {
			int num1 = 0;
			aux = JOptionPane.showInputDialog(men1);
			num1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o idioma: \n1 - Portugês\n2 - Inglês\n");
			int num2 = Integer.parseInt(aux);

			if (num2 == 1) {
				switch (num1) {
				case 1:
					value = "Janeiro";
					break;
				case 2:
					value = "Fevereiro";
					break;
				case 3:
					value = "Março";
					break;
				case 4:
					value = "Abril";
					break;
				case 5:
					value = "Maio";
					break;
				case 6:
					value = "Junho";
					break;
				case 7:
					value = "Julho";
					break;
				case 8:
					value = "Agosto";
					break;
				case 9:
					value = "Setembro";
					break;
				case 10:
					value = "Outubro";
					break;
				case 11:
					value = "Novembro";
					break;
				case 12:
					value = "Dezembro";
					break;
				default:
					value = "Mês desconhecido";
					break;
				}
			} else {
				if (num2 == 2) {
					switch (num1) {
					case 1:
						value = "January";
						break;
					case 2:
						value = "February";
						break;
					case 3:
						value = "March";
						break;
					case 4:
						value = "April";
						break;
					case 5:
						value = "May";
						break;
					case 6:
						value = "June";
						break;
					case 7:
						value = "July";
						break;
					case 8:
						value = "August";
						break;
					case 9:
						value = "September";
						break;
					case 10:
						value = "October";
						break;
					case 11:
						value = "November";
						break;
					case 12:
						value = "December";
						break;
					default:
						value = "Unknow month";
						break;
					}
				}
			}

		} catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos e inteiros!!\n");
		}

		return value;
	}
}
