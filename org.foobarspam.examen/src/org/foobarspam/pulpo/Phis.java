package org.foobarspam.pulpo;

import java.util.HashMap;
import java.util.Scanner;

public class Phis {

	public Phis() {
	}
	
	HashMap<String,Float> mapaCorrelaciones = new HashMap<String,Float>();
	Scanner sc = new Scanner(System.in);
	    int total = 0;
	    float phi;
	    String eventos;
	    
	    public void calcularCorrelaciones(String diario){
	    	// Hacemos un loop de registros
	    	for (int registros =  0; registros < 10; registros++){
	    	    System.out.println("El total es . . . " + registros);
	    	}
	    }
	    public void mostrarCorrelaciones(){
	    	System.out.println(mapaCorrelaciones);
	    }
}
