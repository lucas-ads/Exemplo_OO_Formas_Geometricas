
public class Circulo extends FormaBidimensional{
	private double raio;
	
	public Circulo(double x, double y, String preenchimento, String borda, double raio) {
		super(x, y, preenchimento, borda);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		return Math.PI * raio * raio;
	}
	
	public double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}
}
