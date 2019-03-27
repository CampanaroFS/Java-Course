package exemplo.cap7;

public class UsarBolaFutebol {
	public static void main(String[] args) {
		BolaFutebol bola = new BolaFutebol("Branca", 5, "Oficial");
		bola.mostrar();
		System.out.println(bola.getClass());
		System.out.println(bola.getClass().getSimpleName());
		System.out.println(bola.hashCode());
	}

}
