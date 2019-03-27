package cap7;

public class UsaGPS {
	public static void main(String[] args) {
		GPS gps1 = new GPS();
		GPS gps2 = new GPS("Towarding to Canada");
		
		gps2.mostrar();
		
		gps1.setIdioma("English");
		gps1.setRota("Work");
		gps1.mostrar();
	}

}
