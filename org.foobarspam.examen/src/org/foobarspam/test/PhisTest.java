package org.foobarspam.test;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Test;

public class PhisTest {
	
	@Test
	public void phisUno() {
		phis = new Objects();
		String diario[]={"trabajar", "tocar un árbol", "percebes", "correr", "television"};
		Boolean pulpo = false;
		System.out.println("Mariano hoy ha hecho: " + diario + " => pulpo: " + pulpo);
	}
	@Test
	public void phisDos() {
		phis = new Objects();
		String diario[]={"trabajar", "helado", "coliflor", "lasaña", "tocar un árbol", "lavarse los dientes"};
		Boolean pulpo = false;
		System.out.println("Mariano hoy ha hecho: " + diario + " => pulpo: " + pulpo);
	}
	@Test
	public void phisTres() {
		phis = new Objects();
		String diario[]={"finde", "bicicleta", "descansar", "cacahuetes", "cerveza"};
		Boolean pulpo = true;
		System.out.println("Mariano hoy ha hecho: " + diario + " => pulpo: " + pulpo);
	}
}
