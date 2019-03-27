/**
 * Exercício 1 livro - Faça uma classe que simule o funcionamento de uma bomba d´´agua. A bomba possui um atributo booleano chamado "status" e os métodos "ligar" e "desligar"
 * (ambos sem retorno). O método "ligar" coloca true em "status" e o método "desligar" coloca false em status. A bomba deve ficar ligada durante um certo intervalo de tempo " (em segundos). O tempo
 * em segundos deve ser recebido pelo método ligar. A cada segundo, apresente em tela quantos segundos faltam para a bomba ser desligada. Decorrido o tempo, o método desligar é acionado e a bomba é desligada.
 * */

package cap7;

public class Bomba {
	boolean status = false;
	
	public void ligar(int tempo) throws InterruptedException  {
		System.out.println(status = true);
		Thread.sleep(tempo);	

		desligar();
	}
	public void desligar() {
		status = false;
	}
	public boolean amostragem() {
		return status;
	}

}
