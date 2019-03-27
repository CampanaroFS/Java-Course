package cap6;

public class Contagem {
	public static String contar(){
		String num = "";
		for(int i = 0; i <= 10; i++) {
			num += i + "\n";
		}
		return num;
	}
	public static String contar(int fim) {
		String num = "";
		for(int i = 0; i <= fim; i++) {
			num += i + "\n";
		}
		return num;
	}
	public static String contar(int inicio, int fim) {
		String num = "";
		for(int i = inicio; i <= fim; i++) {
			num += i + "\n";
		}
		return num;
	}
	public static void contar(int inicio, int fim, int pausa) throws InterruptedException {
		for(int i = inicio; i <= fim; i++) {	
			System.out.println(i +"\n");
			Thread.sleep(pausa);
		}
	}

}
