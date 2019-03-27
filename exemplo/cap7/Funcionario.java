package exemplo.cap7;

public class Funcionario extends PessoaFisica {
	private String cartao;
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getCartao() {
		return (cartao);
	}
	public void mostrarClasse() {
		System.out.println("Classe Funcionario");
	}

}
