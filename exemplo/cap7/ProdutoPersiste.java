package exemplo.cap7;
import java.io.*;
public class ProdutoPersiste extends Produto {
	public String gravar() {
		String ret = "Produto armazenado com sucesso!";
		try {
			FileOutputStream file = new FileOutputStream("C:/Produto" + this.getCodigo());
			ObjectOutputStream stream = new ObjectOutputStream(file);
			stream.writeObject(this);
			stream.flush();
		}
		catch (Exception erro) {
			ret = "Falha na gravaçao\n " + erro.toString();
		}
		return ret;
	}
	public static Produto ler(int codigo) {
		try {
			FileInputStream file = new FileInputStream("C:/Produto" + codigo);
			ObjectInputStream stream = new ObjectInputStream(file);
			return ((Produto) stream.readObject());
		}
		catch (Exception erro) {
			System.out.println("Falha na leitura\n " + erro.toString());
			return null;
		}
	}
}
