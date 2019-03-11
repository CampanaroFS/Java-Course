package exemplo.cap4;
import javax.swing.JOptionPane;
public class BuscaLetraNaFrase {
	public static void main(String[] args) {
		String frase = "Livro Java 8 - Ensino Didatico";
		char caractere = 'a';
		JOptionPane.showMessageDialog(null, "Frase: " + frase
				+ "\nÍndice: " + frase.indexOf(caractere)
				+ ", " + frase.indexOf(caractere, 10)
				+ ", " + frase.indexOf("Ensino")
				+ ", " + frase.indexOf("Java", 15));
		System.exit(0);
	}

}
