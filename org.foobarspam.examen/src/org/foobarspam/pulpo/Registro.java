package org.foobarspam.pulpo;


public abstract class Registro {

	//Inicializamos la array con un máximo de 10 eventos
	public String [] eventos = new String[10];
	public Boolean pulpo = true;
    //Boolean mariano = new Boolean("true"); // obtener el contenido de un objeto Boolean
    //boolean b = mariano.booleanValue();
    //System.out.println(b);
	public String[] getEventos() {
		return eventos;
	}
	public void setEventos(String[] eventos) {
		this.eventos = eventos;
	}
	public Boolean getPulpo() {
		return pulpo;
	}
	public void setPulpo(Boolean pulpo) {
		this.pulpo = pulpo;
	}
}
