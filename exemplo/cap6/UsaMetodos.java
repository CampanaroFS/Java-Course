package exemplo.cap6;

 public class UsaMetodos {                                   // S[o é possível utlizar métodos de outra classe sem a criação de objeto, porque é possível pelo fato de o método ter sido declarado como estatic.
	public static void main(String[] args) {
		MetodoSemRetorno.imprimirTexto("Usando método de outra classe"); 
		MetodoSemRetorno.somar(20, 30);
		System.out.println(MetodoComRetorno.mostrarDiaPorExtenso(5));
		System.out.println(MetodoComRetorno.contarLetrasA("Macacada"));
	}

}
