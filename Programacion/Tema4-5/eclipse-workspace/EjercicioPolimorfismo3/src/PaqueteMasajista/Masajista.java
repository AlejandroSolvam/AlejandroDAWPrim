package PaqueteMasajista;

import PaqueteSeleccionFutbol.SeleccionFutbol;

public class Masajista extends SeleccionFutbol{
	private String titulacion;
	private int aniosExp;
	
	public Masajista() {
		super();
		this.titulacion="Titulacion predeterminada";
		this.aniosExp=0;
	}
	
	public Masajista(int newId, String newN, String newAp, int newEd, String newTit, int añEx) {
		super(newId, newN, newAp, newEd);
		this.titulacion=newTit;
		this.aniosExp=añEx;
	}
	
	public String getTitulacion() {
		return this.titulacion;
	}
	
	public int getAñExp() {
		return this.aniosExp;
	}
	
	public void darMasaje() {
		System.out.println("El masajista "+this.getNombre()+" "+this.getApellido()+ " con una edad de "+this.getEdad()+" años "+ " con la titulacion "+this.getTitulacion()+" y "+this.getAñExp()+" años de experiencia va a dar masajes a continuacion a todo el grupo de la seleccion Espanyola.");
	}
}
