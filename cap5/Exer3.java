/**
 * Exercício 3 livro - Uma imagem é formada por pixels. Considere uma imagem com dimensão de 40 x 40 e faça uma classe que contenha um array bidimensional com essas dimensões. A seguir, para cada posição desse
 * array bidimensional armazene um valor aleatório entre 0 a 255 (esses valores correspondem às tonalidades aplicadas sobre a imagem). Apresente em tela os 1600 valores gerados.
 * */
package cap5;
public class Exer3 {
	public static void main(String[] args) {
		int[][] imagem = new int[40][40];
		int indice;

		for (int i = 0; i < imagem.length; i++) {
			for (int j = 0; j < imagem[i].length; j++) {
				do {
					indice = (int) (Math.random() * 1000);
				} while (indice > 255);
				imagem[i][j] = indice;
			}
		}
		for(int i = 0; i < imagem.length; i++) {
			for(int j = 0; j < imagem[i].length; j++) {
				System.out.println("{" + i + "," + j + "] = " + imagem[i][j]);
			}
		}
	}

}
