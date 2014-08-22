package aluguelPac;

public class GeradorAluguelSimples implements GeradorAluguel {

	@Override
	public Aluguel gerarAluguel(int valor, String marca) {
		Carro c = new Carro();
		Aluguel a = new Aluguel();
		c.setMarca(marca);
		a.setCarro(c);
		a.setValor(valor);
		return a;
	}

}
