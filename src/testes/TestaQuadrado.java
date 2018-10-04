package testes;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import objetos.Quadrado;

public class TestaQuadrado {
	
	final double LADO = 25;
	
	Quadrado quadrado;
	Quadrado  quadrado2;
	
	@Before
	public void criaObjetos() throws Exception{
		quadrado = new Quadrado();
		quadrado2 = new Quadrado(LADO);
	}
	
	@Test
	public void testaCriarObjeto(){
		try{
			new Quadrado(0);
			Assert.fail("Esperava uma excecao, pois o lado informado e igual a zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			new Quadrado(-1);
			Assert.fail("Esperava uma excecao, pois o lado informado e negativo.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
	}
	
	@Test
	public void testaMetodoSet(){
		try{
			quadrado.setLargura(0);
			Assert.fail("Esperava uma excecao, pois o lado informado e igual a zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			quadrado.setLargura(-1);
			Assert.fail("Esperava uma excecao, pois o lado informado e negativo.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido é menor ou igual a zero.", e.getMessage());
		}
	}
	
	@Test
	public void testaMetodoGet(){
		Assert.assertTrue(quadrado2.getLargura() == LADO);
		Assert.assertFalse(quadrado2.getLargura() != LADO);
	}
	
	@Test
	public void testaMetodoPerimetro(){
		Assert.assertTrue(quadrado2.perimetro() == 4*LADO);
		Assert.assertFalse(quadrado2.perimetro() != 4*LADO);
	}
	
	public void testaMetodoArea(){
		Assert.assertTrue(quadrado2.area() == LADO*LADO);
		Assert.assertFalse(quadrado2.area() != LADO*LADO);
	}
}
