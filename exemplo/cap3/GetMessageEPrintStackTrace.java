package exemplo.cap3;
import javax.swing.JOptionPane;
public class GetMessageEPrintStackTrace {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um numero"));
		try {		
			int y = x / 0;
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
			erro.printStackTrace();
		}
	}

}
