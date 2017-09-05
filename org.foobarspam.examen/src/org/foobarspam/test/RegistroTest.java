package org.foobarspam.test;

import org.junit.Test;

public class RegistroTest {

	@Test
	public void verdadero() {
		String eventos[]={"trabajar", "tocar un árbol", "hamburguesa", "correr", "percebes"};
		Boolean pulpo = true;
		System.out.println(eventos);
	}
	@Test
	public void falso() {
		String eventos[]={"descansar", "tocar un árbol", "hamburguesa", "correr", "sandia"};
		Boolean pulpo = false;
		System.out.println(eventos);
	}

}
