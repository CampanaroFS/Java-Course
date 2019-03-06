package exemplo.cap3;
import javax.swing.JOptionPane;
public class If {
	public static void main(String[] args) {
		Object[] op = {"Masculino", "Feminino"};
		String resp = (String) JOptionPane.showInputDialog(null,
				"Selecione o sexo:\n", "Pesquisa",
				JOptionPane.QUESTION_MESSAGE,
				null, op, "Masculino");
		if(resp == null) {
			JOptionPane.showMessageDialog(null, "Você pressionou cancel");
		}
		if(resp == "Masculino") {
			JOptionPane.showMessageDialog(null, "Você é homem.");
		}
		if(resp == "Feminino") {
			JOptionPane.showMessageDialog(null, "Vocé é mulher.");
		}
		System.exit(0);
	}

}
