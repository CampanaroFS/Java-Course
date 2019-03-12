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
