package test;

import org.junit.Test;

import classes.Triangulo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


public class Trianguloteste {

	Triangulo triangulo1;
	Triangulo triangulo2;
	Triangulo triangulo3;
	
	@Before
	public void inicializar() {
		triangulo1 = new Triangulo(4,4,4);
		triangulo2 = new Triangulo(8,8,4);
		triangulo3 = new Triangulo(2,3,4);
	}
	
	@Test
	public void retornarResultadoEquilatero() {
		String valorEsperado = "Equilatero";
		String valorRetornado = triangulo1.tipo_triangulo(triangulo1);
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void retornarResultadoIsoceles() {
		String valorEsperado = "Isoceles";
		String valorRetornado = triangulo2.tipo_triangulo(triangulo2);
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void retornarResultadoEscaleno() {
		String valorEsperado = "Escaleno";
		String valorRetornado = triangulo3.tipo_triangulo(triangulo3);
		assertEquals(valorEsperado, valorRetornado);
	}

	
	
	

}
