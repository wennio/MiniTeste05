package aluguelPac;

import java.util.ArrayList;
import java.util.List;

public class Alugador {
	private List<Aluguel> alugueis;
	public Alugador() {
		
		alugueis = new ArrayList<Aluguel>();
	}

	public void cadastrarAluguel(int valor, String marca, GeradorAluguel gerador) {
		alugueis.add(gerador.gerarAluguel(valor, marca));
	}

	public List<Aluguel> getAlugueis() {
		return alugueis;
	}

	public void setAlugueis(List<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}

}
