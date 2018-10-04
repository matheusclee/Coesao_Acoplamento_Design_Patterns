package objetos;

public class Retangulo implements FiguraGeometrica{
	
	private double altura;
	private double largura;
	
	public Retangulo() {
	}
	
	public Retangulo(double altura, double largura) throws Exception{
		setAltura(altura);
		setLargura(largura);
	}
	
	@Override
	public double perimetro() {
		return (2 * getAltura() + (2 * getLargura()));
	}

	@Override
	public double area() {
		return getAltura() * getLargura();
	}
	
	public String toString(){
		return "O retangulo criado tem altura de " + getAltura() + " e largura de " + getLargura() + ".";
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws Exception {
		if(altura > 0){
			this.altura = altura;
		}else{
			throw new Exception("O valor inserido da altura é menor ou igual a zero.");
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) throws Exception {
		if(largura > 0){
			this.largura = largura;
		}else{
			throw new Exception("O valor inserido da largura é menor ou igual a zero.");
		}
	}

}
