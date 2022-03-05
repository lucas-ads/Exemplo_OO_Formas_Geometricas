
public class Retangulo extends FormaBidimensional{
	private double altura;
	private double base;
	
	public Retangulo(double x, double y, String preenchimento, String borda, double altura, double base) {
		super(x, y, preenchimento, borda);
		this.altura = altura;
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	
	
}
