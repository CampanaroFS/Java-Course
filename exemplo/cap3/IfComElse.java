package exemplo.cap3;
import javax.swing.JOptionPane;
public class IfComElse {
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Forne�a o n�mero do m�s");
		if(aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				if(mes >= 1 && mes <= 12) {
					JOptionPane.showMessageDialog(null, "N�mero do m�s v�lido!\n" + mes);
				}else {
					JOptionPane.showMessageDialog(null, "N�mero do m�s inv�lido!\n" + mes);
				}
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null,  "Digite apenas valores inteiros" + erro);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Opera��o cancelada.");
		}
	
	System.exit(0);
	}
}
