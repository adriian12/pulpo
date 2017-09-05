package org.foobarspam.pulpo;

public class TablaEvento {

	public TablaEvento() {
		//array con los valores de la tabla del modo [76, 9, 4, 1]
		int Tabla arrayTabla[]=new Tabla[4];
		String evento = "";
	}
	public void contieneEvento( String evento, String registro){
		
	}
	public String tablaPara(String evento, String diario, double total){
		int vectorTabla = -1;
		for (int i = 0; i < getEventos().length; i++) {
			if (getEventos()[i] == null) {
				setEventos(i, Registro);
				vectorTabla = i + 1;
				break;
			}
		}
		if (vectorTabla != -1) {
			mostrarTabla(Registro, vectorTabla);
			System.out.println("Se ha convertido en pulpo!!!");
		} else {
			System.out.println("NO se ha convertido en pulpo");
		}
	}
	
	public void mostrarTabla(){
		System.out.println(vectorTabla);
	}
}
