package paqueteFutbolista;

import paqueteSeleccionFutbol.SeleccionFutbol;
public class Futbolista extends SeleccionFutbol{
	private int dorsal;
	private String demarcacion;
	
	public Futbolista() {
		super();
		this.dorsal=0;
		this.demarcacion="Demarcacion predeterminada";
	}
	
	public Futbolista(int newId, String newN, String newAp, int newEd,int newD, String newDem) {
		super(newId,newN,newAp,newEd);
		this.dorsal=newD;
		this.demarcacion=newDem;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	public void entrevista() {
		System.out.println("Se esta entrevistando al futbolista "+super.getNombre() + " " +super.getApellidos() + " con dorsal "+this.getDorsal()+" que juega en la demarcacion de "+this.getDemarcacion());
	}
	
	public void entrenamiento() {
		System.out.println("El futbolista realiza un entrenamiento");
	}
	
	public void partidoFutbol() {
		System.out.println("El futbolista esta disputando un partido de futbol");
	}
	
}
