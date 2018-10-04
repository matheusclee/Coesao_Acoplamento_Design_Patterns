package objetos;

public class BrincandoComAsFigurasGeometricas {
	
	public static void main(String[] args) throws Exception{
		
		Retangulo retangulo = new Retangulo(15, 10);
		Quadrado quadrado = new Quadrado(20);
		Circulo circulo = new Circulo(37);
		
		//Imprimindo toString, perimetro e area do retangulo
		System.out.println(retangulo.toString()
				+ "\nO seu perímetro é: " + retangulo.perimetro()
				+ "\nE sua área é: " + retangulo.area() + "\n\n");
		
		//Imprimindo toString, perimetro e area do quadrado
		System.out.println(quadrado.toString()
				+ "\nO seu perímetro é: " + quadrado.perimetro()
				+ "\nE sua área é: " + quadrado.area() + "\n\n");
		
		
		//Imprimindo toString, perimetro e area do circulo
		System.out.println(circulo.toString()
				+ "\nO seu perímetro é: " + circulo.perimetro()
				+ "\nE sua área é: " + circulo.area() + "\n\n");
		
	}

}
