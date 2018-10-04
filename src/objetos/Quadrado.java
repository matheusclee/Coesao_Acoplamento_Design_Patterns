package objetos;

public class Quadrado implements FiguraGeometrica{
	
	private double largura;
	
	public Quadrado(){
		
	}
	public Quadrado(double largura) throws Exception{
		this.setLargura(largura);
	}
	
	@Override
	public double perimetro() {
		return 4 * getLargura() ;
	}

	@Override
	public double area() {
		return getLargura() * getLargura();
	}
	
	public String toString(){
		return "O quadrado criado tem lados de tamanho igual a " + getLargura() + ".";
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) throws Exception{
		if(largura > 0){
			this.largura = largura;
		}else{
			throw new Exception("O valor inserido é menor ou igual a zero.");
		}
	}

}
