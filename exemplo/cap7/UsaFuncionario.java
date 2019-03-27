package exemplo.cap7;

public class UsaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Felipe");
		funcionario.setRg("46.230.21x-x");
		funcionario.setCartao("RH845");
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getRg());
		System.out.println(funcionario.getCartao());
	}

}
