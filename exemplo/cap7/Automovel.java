package exemplo.cap7;

public class Automovel extends Veiculo {
	@Override
	public void acelerar() { // métodos obrigratório para essa classe, uma vez que ele foi definido  como abstrato na classe veículo.
		velocidade++;
	}

}
