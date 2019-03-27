/**
 * Exerc�cio 3 livro - Uma imagem � formada por pixels. Considere uma imagem com dimens�o de 40 x 40 e fa�a uma classe que contenha um array bidimensional com essas dimens�es. A seguir, para cada posi��o desse
 * array bidimensional armazene um valor aleat�rio entre 0 a 255 (esses valores correspondem �s tonalidades aplicadas sobre a imagem). Apresente em tela os 1600 valores gerados.
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
