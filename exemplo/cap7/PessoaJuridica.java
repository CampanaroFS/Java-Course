package exemplo.cap7;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return (cnpj);
	}
	public void mostrarClasse() {
		System.out.println("Classe PessoaJurídica");
	}

}
