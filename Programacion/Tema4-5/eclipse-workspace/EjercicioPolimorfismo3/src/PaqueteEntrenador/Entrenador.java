package PaqueteEntrenador;

import PaqueteSeleccionFutbol.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol{
	private int idEntrenador;
	
	public Entrenador() {
		super();
		idEntrenador=0;
	}
	
	public Entrenador(int newId, String newN, String newAp, int newEd, int newIdEn) {
		super(newId, newN, newAp, newEd);
		idEntrenador=newIdEn;
	}
	
	public int getIdEntrenador() {
		return this.idEntrenador;
	}
	
	public void planificarEntrenamiento() {
		System.out.println("El seleccionador "+this.getNombre()+" "+this.getApellido()+ " con una edad de "+this.getEdad()+ " años " + " con id "+this.getIdEntrenador()+" ha planificado un nuevo entrenamiento para la selección Espanyola. Jugaran un amistoso entre los 22 jugadores, con 2 onces. El primer once sera una 4-3-3 y el otro un 3-5-2. ");
	}
}
