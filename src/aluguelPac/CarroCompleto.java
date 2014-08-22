package aluguelPac;

public class CarroCompleto extends Carro {
	private String extras;
	private double valorExtra;
	
	public String toString(){
		String s = "";
		s += "%"+this.getMarca();
		s += "%"+this.getExtras();
		s += "%"+this.getValorExtra();
		return s;
		
	}
	
	
	public String getExtras() {
		return extras;
	}
	public void setExtras(String extras) {
		this.extras = extras;
	}
	public double getValorExtra() {
		return valorExtra;
	}
	public void setValorExtra(double d) {
		this.valorExtra = d;
	}
	
	
}
