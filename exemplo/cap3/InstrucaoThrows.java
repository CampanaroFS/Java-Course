package exemplo.cap3;

import javax.swing.JOptionPane;
public class InstrucaoThrows {
	public static void main(String[] args) {
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Forne�a sua idade"));
			if(idade < 18) {
				throw new Exception("Menor de idade, entrada n�o permitida!!");
			}else {
				JOptionPane.showMessageDialog(null, "Idade v�lida, seja bem vindo!");
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.toString());
		}
	}

}
