package cap7;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Brinquedo {
	private String nome;
	private String faixaEtaria;
	private float preco;

	public Brinquedo() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return (nome);
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return (preco);
	}

	public Brinquedo(String nome) {
		this.nome = nome;
	}

	public Brinquedo(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void setFaixaEtaria(String mem) throws IOException {
		String aux = "";
		int n = 0;
		try {
			aux = JOptionPane.showInputDialog(mem);
			n = Integer.parseInt(aux);

			switch (n) {
			case 1:
				faixaEtaria = "0 a 2";
				break;
			case 2:
				faixaEtaria = "3 a 5";
				break;
			case 3:
				faixaEtaria = "6 a 10";
				break;
			case 4:
				faixaEtaria = "Acima de 10";
				break;
			default:
				throw new Exception("Valor não permitido!");
			}

		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "Valor digitado está incorreto!!\n" + error.toString());
		}
	}

	public void mostrar() {
		System.out.println("Brinquedo: " + nome + "\nPreco: R$" + preco + "\nFaixa etária: " + faixaEtaria + " anos");
	}

}
