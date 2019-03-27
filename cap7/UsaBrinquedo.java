package cap7;

import java.io.IOException;

public class UsaBrinquedo {
	public static void main(String[] args) throws IOException {
		Brinquedo brinquedo1 = new Brinquedo();
		Brinquedo brinquedo2 = new Brinquedo("Quebra-Cabeça");
		Brinquedo brinquedo3 = new Brinquedo("Carrinho", 200.99f);
		
		brinquedo1.setNome("Video-Game");
		brinquedo1.setPreco(2000.00f);
		brinquedo1.setFaixaEtaria("Digite a faixa etaria do brinquedo 1:\n1 - 0 a 2 anos\n2 - 3 a 5 anos\n3 - 6 a 10 anos\n4 - acima de 10 anos\n");
		brinquedo1.mostrar();
		System.out.println("\n");
		brinquedo2.setPreco(50.90f);
		brinquedo2.setFaixaEtaria("Digite a faixa etaria do brinquedo 2:\n1 - 0 a 2 anos\n2 - 3 a 5 anos\n3 - 6 a 10 anos\n4 - acima de 10 anos\n");
		brinquedo2.mostrar();
		System.out.println("\n");
		brinquedo3.setFaixaEtaria("Digite a faixa etária do brinquedo 3:\n1 - 0 a 2 anos\n2 - 3 a 5 anos\n3 - 6 a 10 anos\n4 - acima de 10 anos\n");
		brinquedo3.mostrar();
		
	}

}
