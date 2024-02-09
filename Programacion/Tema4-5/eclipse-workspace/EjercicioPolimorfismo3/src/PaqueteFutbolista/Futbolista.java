package PaqueteFutbolista;

import PaqueteSeleccionFutbol.SeleccionFutbol;
public class Futbolista extends SeleccionFutbol{
	private int dorsal;
	private String demarcacion;
	
	public Futbolista() {
		super();
		this.dorsal=0;
		this.demarcacion="Predeterminada";
	}
	
	public Futbolista(int newId, String newN, String newAp, int newEd, int newD, String newDem) {
		super(newId, newN, newAp, newEd);
		this.dorsal=newD;
		this.demarcacion=newDem;
	}
	
	public int getDorsal() {
		return this.dorsal;
	}
	
	public String getDemarcacion() {
		return this.demarcacion;
	}
	
	public void Entrevista() {
		System.out.println("Nos encontramos actualmente entrevistando al futbolista "+this.getNombre()+" "+this.getApellido()+ " con una edad de "+this.getEdad()+" años " + "futbolista con el dorsal "+this.getDorsal()+" y que juega en la demarcacion de "+this.getDemarcacion());
	}
}
