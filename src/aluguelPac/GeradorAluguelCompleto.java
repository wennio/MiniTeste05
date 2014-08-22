package aluguelPac;

public class GeradorAluguelCompleto implements GeradorAluguel {

	@Override
	public Aluguel gerarAluguel(int valor, String marca) {
		CarroCompleto c = new CarroCompleto();
		Aluguel a = new Aluguel();
		c.setMarca(marca);
		c.setExtras("arcondicionado%4portas%vidrosTravasEletricos");
		c.setValorExtra(50.0);
		a.setCarro(c);
		a.setValor(valor);
		
		
		return a;
	}

}
