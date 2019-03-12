package cap5;

import java.util.Arrays;

public class Exer4 {
	public static void main(String[] args) {
		int[] par = new int[10];
		int[] impar = new int[10];
		int valor;
		
		for(int i = 0; i < 10; i++) {
			do {
				valor = (int) (Math.random() * 100);
			} while (valor > 20);
			
			int y = 0;
			int z = 0;
			if(valor % 2 == 0) {
					par[y] = valor;
					y++;
			} else {
					impar[z] = valor;
					z++;
			}
			
		}
		
		System.out.println("\nPar: ");
		for(int y = 0; y < par.length; y++) {
			System.out.println("[" + y + "] = " + par[y]);
		}
		
		System.out.println("\nÍmpar: ");
		for(int z = 0; z < impar.length; z++) {
			System.out.println("[" + z + "] = " + impar[z]);
		}

	}
}