package objetos;

public class Circulo implements FiguraGeometrica{
	
	private double raio;
	private static final double PI = 3.14;
	private static final int DOIS = 2; //faz parte da fórmula de calculo de perimetro
	
	public Circulo(){
		
	}
	
	public Circulo(double raio) throws Exception{
		setRaio(raio);
	}
	@Override
	public double perimetro() {
		return DOIS*PI*getRaio();
	}
	@Override
	public double area() {
		return PI*(getRaio()*getRaio());
	}
	
	public String toString(){
		return "O raio do circulo é igual a " + getRaio();
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) throws Exception{
		if(raio > 0){
			this.raio = raio;
		}else{
			throw new Exception("O valor inserido é menor ou igual a zero.");
		}
	}
	
	
	
}
