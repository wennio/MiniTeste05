package aluguelPac;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CadastroAluguelTest {
	private Alugador alugador;
	
	@Before
	public void cadastroAluguel(){
		alugador = new Alugador();
	}
	
	@Test
	public void cadastrarAluguelComum() {
		int valor = 300;
		String marca = "palio";
		alugador.cadastrarAluguel(valor,marca, new GeradorAluguelSimples());
		Assert.assertEquals(1, alugador.getAlugueis().size());
		String tostring = "300%palio";
		Assert.assertEquals(tostring, alugador.getAlugueis().get(0).toString());
	}
	@Test
	public void cadastrarAluguelCompleto() {
		int valor = 1000;
		String marca = "sandero";
		alugador.cadastrarAluguel(valor,marca, new GeradorAluguelCompleto());
		Assert.assertEquals(1, alugador.getAlugueis().size());
		String tostring = "1000%sandero%arcondicionado%4portas%vidrosTravasEletricos%50.0";
		Assert.assertEquals(tostring, alugador.getAlugueis().get(0).toString());
	}

}
