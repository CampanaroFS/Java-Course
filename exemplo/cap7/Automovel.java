package exemplo.cap7;

public class Automovel extends Veiculo {
	@Override
	public void acelerar() { // m�todos obrigrat�rio para essa classe, uma vez que ele foi definido  como abstrato na classe ve�culo.
		velocidade++;
	}

}
