package exemplo.cap3;
import javax.swing.JOptionPane;
public class TryCatch {
	public static void main(String[] args) {
		try {
			String aux1 = JOptionPane.showInputDialog("Forne�a o valor do 1� n�mero:");
			int num1 = Integer.parseInt(aux1.toString());
			String aux2 = JOptionPane.showInputDialog("Forne�a o valor do 2� n�mero:");
			int num2 = Integer.parseInt(aux2.toString());
			JOptionPane.showMessageDialog(null, "Soma =" + (num1 + num2));
			JOptionPane.showMessageDialog(null, "Subtra��o = " + (num1 - num2));
			JOptionPane.showMessageDialog(null, "Multiplica��o = " + (num1 * num2));
			JOptionPane.showMessageDialog(null, "Divis�o = " + (num1 / num2));
		} catch (ArithmeticException  | NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro de divis�o por zero!\n" + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		} //catch (NumberFormatException erro) {
			//JOptionPane.showMessageDialog(null, "Erro de convers�o!\n" + erro.toString(), "Erro",
				//	JOptionPane.ERROR_MESSAGE);		} 
		catch (NullPointerException erro) {
			JOptionPane.showMessageDialog(null, "Erro cancel pressionada!\n" + erro.toString(),
					"Cancelado pelo usu�rio", JOptionPane.ERROR_MESSAGE);

		} finally {
			JOptionPane.showMessageDialog(null, "Final da execu��o!");
		}
		System.exit(0);
	}

}
