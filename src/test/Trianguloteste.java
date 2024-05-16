package test;

import org.junit.Test;

import classes.Triangulo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


public class Trianguloteste {

	Triangulo triangulo1,triangulo2,triangulo3,triangulo4,triangulo5,triangulo6, triangulo7, triangulo8, triangulo9, triangulo10,triangulo11,triangulo12,triangulo13,triangulo14,triangulo15,triangulo16, triangulo17, triangulo18;
	
	@Before
	public void inicializar() {
		triangulo1 = new Triangulo(4,4,4);
		triangulo2 = new Triangulo(8,8,4);
		triangulo3 = new Triangulo(2,3,4);
		triangulo4 = new Triangulo(6,6,4);
		triangulo5 = new Triangulo(4,6,6);
		triangulo6 = new Triangulo(6,4,6);
		triangulo7 = new Triangulo(7,2,0);
		triangulo8 = new Triangulo(7,2,-1);
		triangulo9 = new Triangulo(7,7,14);
		triangulo10 = new Triangulo(7,7,14);
		triangulo11 = new Triangulo(7,14,7);
		
		triangulo12 = new Triangulo(6,14,7);
		triangulo13 = new Triangulo(6,7,14);
		triangulo14 = new Triangulo(7,6,14);
		triangulo15 = new Triangulo(7,14,6);
		triangulo16 = new Triangulo(14,6,7);
		triangulo17 = new Triangulo(14,7,6);
		
		triangulo18 = new Triangulo(0,0,0);
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
	public void retornarResultadoIsoceles1() {
		String valorEsperado = "Isoceles";
		String valorRetornado = triangulo4.tipo_triangulo(triangulo4);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void retornarResultadoIsoceles2() {
		String valorEsperado = "Isoceles";
		String valorRetornado = triangulo5.tipo_triangulo(triangulo5);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void retornarResultadoIsoceles3() {
		String valorEsperado = "Isoceles";
		String valorRetornado = triangulo6.tipo_triangulo(triangulo6);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void retornarResultadoEscaleno() {
		String valorEsperado = "Escaleno";
		String valorRetornado = triangulo3.tipo_triangulo(triangulo3);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void ladoZero() {
		String valorEsperado = "Não é triangulo. Lado zero";
		String valorRetornado = triangulo7.tipo_triangulo(triangulo7);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void ladoNegativo() {
		String valorEsperado = "Não é triangulo. Lado negativo";
		String valorRetornado = triangulo8.tipo_triangulo(triangulo8);
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void doisLadosIguais1() {
		String valorEsperado = "Não é triangulo. Soma de dois lados igual terceiro lado";
		String valorRetornado = triangulo9.tipo_triangulo(triangulo9);
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void doisLadosIguais2() {
		String valorEsperado = "Não é triangulo. Soma de dois lados igual terceiro lado";
		String valorRetornado = triangulo10.tipo_triangulo(triangulo10);
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void doisLadosIguais3() {
		String valorEsperado = "Não é triangulo. Soma de dois lados igual terceiro lado";
		String valorRetornado = triangulo11.tipo_triangulo(triangulo11);
		assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	public void doisLadosMenor1() {
		String valorEsperado = "Não é triangulo. Soma de dois lados menor que o terceiro lado";
		String valorRetornado = triangulo12.tipo_triangulo(triangulo12);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void doisLadosMenor2() {
		String valorEsperado = "Não é triangulo. Soma de dois lados menor que o terceiro lado";
		String valorRetornado = triangulo13.tipo_triangulo(triangulo13);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void doisLadosMenor3() {
		String valorEsperado = "Não é triangulo. Soma de dois lados menor que o terceiro lado";
		String valorRetornado = triangulo14.tipo_triangulo(triangulo14);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void doisLadosMenor4() {
		String valorEsperado = "Não é triangulo. Soma de dois lados menor que o terceiro lado";
		String valorRetornado = triangulo15.tipo_triangulo(triangulo15);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void doisLadosMenor5() {
		String valorEsperado = "Não é triangulo. Soma de dois lados menor que o terceiro lado";
		String valorRetornado = triangulo16.tipo_triangulo(triangulo16);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void doisLadosMenor6() {
		String valorEsperado = "Não é triangulo. Soma de dois lados menor que o terceiro lado";
		String valorRetornado = triangulo17.tipo_triangulo(triangulo17);
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void tresLadoZero() {
		String valorEsperado = "Não é triangulo. Tres lados zero";
		String valorRetornado = triangulo18.tipo_triangulo(triangulo18);
		assertEquals(valorEsperado, valorRetornado);
	}
}
