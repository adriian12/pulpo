package org.foobarspam.pulpo;
import java.util.ArrayList;

public abstract class Diario {


	public Diario() {

	}
	
	public void incluirRegistro(String [] eventos){
        //Creamos un array de objetos de tipo resgistro
        Registro arrayObjetos[]=new Registro[5];
 
		//Creamos un objeto en la primera posición
        arrayObjetos[0]=new eventos["correr"];
        //Recorrer el array 
        for (int i=0; i<arrayObjetos.length; i++){
            System.out.println(arrayObjetos[i]);
            total+=arrayObjetos[i].getEventos();
        }
        //Mostrar lo que ha hecho Mariano en el día
        System.out.println(total);
	}
	
}