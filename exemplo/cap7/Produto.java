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
	public String getDescri��o() {
		return descricao;
	}
	public void setDescri��o(String descricao) {
		this.descricao = descricao;
	}

}
