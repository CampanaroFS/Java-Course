package exemplo.cap7;
import java.io.Serializable;
public class Produto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String descricao;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescrição() {
		return descricao;
	}
	public void setDescrição(String descricao) {
		this.descricao = descricao;
	}

}
