
public class FormaBidimensional {
	private double posicaoX;
	private double posicaoY;
	private String preenchimento;
	private String borda;
	
	public FormaBidimensional(double x, double y, String preenchimento, String borda) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.preenchimento = preenchimento;
		this.borda = borda;
	}
	
	public String getPreenchimento() {
		return preenchimento;
	}
	public void setPreenchimento(String preenchimento) {
		this.preenchimento = preenchimento;
	}
	public String getBorda() {
		return borda;
	}
	public void setBorda(String borda) {
		this.borda = borda;
	}
	public double getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(double posicaoX) {
		this.posicaoX = posicaoX;
	}
	public double getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoY(double posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	
}
