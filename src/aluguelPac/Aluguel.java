package aluguelPac;

public class Aluguel {
	private Carro carro;
	private int valor;
	
	public String toString(){
		String s = "";
		s += valor;
		s += carro.toString();
		return s;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
