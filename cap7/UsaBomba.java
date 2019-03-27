/**
 * Crie uma classe chamada UsaBomba que utilize a classe do exercício anterior. Ela deve conter o método main e:
 * * Instanciar uma bomba (bomba1);
 * * ligar o objeto boma1 durante 5 segundos;
 * */

package cap7;

public class UsaBomba {
	public static void main(String[] args) throws InterruptedException {
		Bomba bomba1 = new Bomba();
		bomba1.ligar(5000);
		System.out.println(bomba1.amostragem());
	}

}
