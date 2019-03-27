package cap7;

public class GPS {
	private  String idioma = "";
	private String rota = "";
	private boolean status = false;
	
	public GPS() {
		
	}
	public GPS(String rota) {
		status = true;
		idioma = "Portugês";
		this.rota = rota;
		
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getIdioma() {
		return (idioma);
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	public String getRota() {
		return (rota);
	}
	public void mostrar() {
		System.out.println("Estado: " + status + "\nIdioma: " + idioma + "\nRota: " + rota);
	}

}
