package exemplo.cap7;
public class UsaProduto {
	public static void main(String[] args) {
		// teste de grava��o
		ProdutoPersiste produto = new ProdutoPersiste();
		produto.setCodigo(2);
		produto.setDescri��o("Sabonete");
		System.out.println(produto.gravar());
		// teste de leitura
		Produto p = ProdutoPersiste.ler(2);
		System.out.println(p.getCodigo());
		System.out.println(p.getDescri��o());
	}

}
