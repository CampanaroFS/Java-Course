package exemplo.cap6;

 public class UsaMetodos {                                   // S[o � poss�vel utlizar m�todos de outra classe sem a cria��o de objeto, porque � poss�vel pelo fato de o m�todo ter sido declarado como estatic.
	public static void main(String[] args) {
		MetodoSemRetorno.imprimirTexto("Usando m�todo de outra classe"); 
		MetodoSemRetorno.somar(20, 30);
		System.out.println(MetodoComRetorno.mostrarDiaPorExtenso(5));
		System.out.println(MetodoComRetorno.contarLetrasA("Macacada"));
	}

}
