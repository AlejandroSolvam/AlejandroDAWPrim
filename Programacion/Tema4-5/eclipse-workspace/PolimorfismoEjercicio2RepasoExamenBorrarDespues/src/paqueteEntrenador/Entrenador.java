package paqueteEntrenador;

import paqueteSeleccionFutbol.SeleccionFutbol;
public class Entrenador extends SeleccionFutbol{
	private int idFederacion;
	
	public Entrenador() {
		super();
		this.idFederacion=0;
	}
	
	public Entrenador(int newId, String newN, String newAp, int newEd,int newIdF) {
		super(newId,newN,newAp,newEd);
		this.idFederacion=newIdF;
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	public void planificarEntrenamiento() {
		System.out.println("El entrenador "+super.getNombre()+" con id de federacion" + this.getId() +" ha planificado un nuevo entrenamiento.");
	}
	
	public void entrenamiento() {
		System.out.println("El entrenador dirige un entrenamiento");
	}
	
	public void partidoFutbol() {
		System.out.println("El entrenador esta dirigiendo un partido de futbol");
	}
}
