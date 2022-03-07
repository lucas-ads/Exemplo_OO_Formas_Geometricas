
public class Quadrado extends FormaBidimensional{
	private double lado;

	public Quadrado(double x, double y, String preenchimento, String borda, double lado) {
		super(x, y, preenchimento, borda);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calculaArea() {
		return lado * lado;
	}
	
	public double calculaPerimetro() {
		return lado * 4;
	}
	
}
