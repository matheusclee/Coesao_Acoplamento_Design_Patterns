package testes;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import objetos.Retangulo;

public class TestaRetangulo {
	
	Retangulo retangulo;
	Retangulo retangulo2;
	final double ALTURA = 30;
	final double LARGURA = 50;
	
	@Before
	public void criaObjeto() throws Exception{
		retangulo = new Retangulo();
		retangulo2 = new Retangulo(ALTURA, LARGURA);
	}

	@Test
	public void testaCriaRetagulo(){
		try{
			new Retangulo(-1,1);
			Assert.fail("Esperava uma excecao, pois foi informado uma altura negativa.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da altura é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			new Retangulo(1,-1);
			Assert.fail("Esperava uma excecao, pois foi informado uma largura negativa.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da largura é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			new Retangulo(0, 1);
			Assert.fail("Esperava uma excecao, pois foi informada uma altura igual a zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da altura é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			new Retangulo(1,0);
			Assert.fail("Esperava uma excecao, pois foi informado uma largura igual a zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da largura é menor ou igual a zero.", e.getMessage());
		}
	}
	
	@Test
	public void testaMetodoSet(){
		try{
			retangulo.setAltura(-1);
			Assert.fail("Esperava uma excecao, pois foi informado uma altura negativa.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da altura é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			retangulo.setLargura(-1);
			Assert.fail("Esperava uma excecao, pois foi informado uma largura negativa.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da largura é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			retangulo.setAltura(0);
			Assert.fail("Esperava uma excecao, pois foi informada uma altura igual a zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da altura é menor ou igual a zero.", e.getMessage());
		}
		
		try{
			retangulo.setLargura(0);
			Assert.fail("Esperava uma excecao, pois foi informado uma largura igual a zero.");
		}catch (Exception e){
			Assert.assertEquals("O valor inserido da largura é menor ou igual a zero.", e.getMessage());
		}

	}
	
	@Test
	public void testaMetodoGet(){
		Assert.assertTrue(retangulo2.getAltura() == ALTURA);
		Assert.assertFalse(retangulo2.getAltura() != ALTURA);
		
		Assert.assertTrue(retangulo2.getLargura() == LARGURA);
		Assert.assertFalse(retangulo2.getLargura() != LARGURA);
	}
	
	@Test 
	public void testaMetodoPerimetro(){
		Assert.assertTrue(retangulo2.perimetro() == (2*ALTURA)+(2*LARGURA));
		Assert.assertFalse(retangulo2.perimetro() != (2*ALTURA)+(2*LARGURA));
	}
	
	@Test
	public void testaMetodoArea(){
		Assert.assertTrue(retangulo2.area() == ALTURA*LARGURA);
		Assert.assertFalse(retangulo2.area() != ALTURA*LARGURA);
	}
	
}
