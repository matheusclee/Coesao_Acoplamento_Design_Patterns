package testes;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import objetos.Circulo;

public class TestaCirculo {
	
	Circulo circulo;
	Circulo circulo2;
	
	final double RAIO = 15;
	final double PI = 3.14;
	
	@Before
	public void criaObjeto() throws Exception{
		circulo = new Circulo();
		circulo2 = new Circulo(RAIO);
	}
	
	@Test
	public void testaCriaRetangulo(){
		try{
			new Circulo(-1);
			Assert.fail("Esperava uma excecao, pois o raio informado e negativo.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			new Circulo(0);
			Assert.fail("Esperava uma excecao, pois o raio informado e zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
	}
	
	@Test
	public void testaMetodoSet(){
		try{
			circulo.setRaio(-1);
			Assert.fail("Esperava uma excecao, pois o raio informado e negativo.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			circulo.setRaio(0);
			Assert.fail("Esperava uma excecao, pois o raio informado e zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
	}
	
	@Test
	public void testaMetodoGet(){
		Assert.assertTrue(circulo2.getRaio() == RAIO);
		Assert.assertFalse(circulo2.getRaio() != RAIO);
	}
	
	@Test
	public void testaMetodoArea(){
		Assert.assertTrue(circulo2.area() == PI*(RAIO*RAIO));
		Assert.assertFalse(circulo2.area() != PI*(RAIO*RAIO));
	}
	
	@Test
	public void testaMetodoperimetro(){
		Assert.assertTrue(circulo2.perimetro() == 2*PI*RAIO);
		Assert.assertFalse(circulo2.perimetro() != 2*PI*RAIO);
	}
	
}
