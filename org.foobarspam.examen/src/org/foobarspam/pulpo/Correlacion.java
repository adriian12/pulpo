package org.foobarspam.pulpo;

public class Correlacion {

	public Correlacion() {
	}
	//Creamos una tabla con los 4 numeros
	Object tabla[][] = {{76,9,4,1}};
	Object[][] phi = tabla;
	
	public double phi(){
		int tabla[][];
		tabla = new int[4][4];
		for (int x=0; x < tabla.length; x++) {
		  for (int y=0; y < tabla[x].length; y++) {
		      System.out.println (tabla[x][y]);
		  }
		}
		return 0;
	}
}
