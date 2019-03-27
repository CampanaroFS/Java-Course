package cap6;

public class Senha {
	public static String gerar() {
		String password = "";
		int i = 0;
		
		while(i < 8) {
			password += (int) (Math.random() * 10);
			i++;
		}
		return password;
	}

}
