package objetos;

public class BrincandoComAsFigurasGeometricas {
	
	public static void main(String[] args) throws Exception{
		
		Retangulo retangulo = new Retangulo(15, 10);
		Quadrado quadrado = new Quadrado(20);
		Circulo circulo = new Circulo(37);
		
		//Imprimindo toString, perimetro e area do retangulo
		System.out.println(retangulo.toString()
				+ "\nO seu per�metro �: " + retangulo.perimetro()
				+ "\nE sua �rea �: " + retangulo.area() + "\n\n");
		
		//Imprimindo toString, perimetro e area do quadrado
		System.out.println(quadrado.toString()
				+ "\nO seu per�metro �: " + quadrado.perimetro()
				+ "\nE sua �rea �: " + quadrado.area() + "\n\n");
		
		
		//Imprimindo toString, perimetro e area do circulo
		System.out.println(circulo.toString()
				+ "\nO seu per�metro �: " + circulo.perimetro()
				+ "\nE sua �rea �: " + circulo.area() + "\n\n");
		
	}

}
