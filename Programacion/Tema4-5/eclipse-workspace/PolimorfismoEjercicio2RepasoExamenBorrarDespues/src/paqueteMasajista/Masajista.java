package paqueteMasajista;

import paqueteSeleccionFutbol.SeleccionFutbol;
public class Masajista extends SeleccionFutbol{
	private String titulacion;
	private int anyosExperiencia;
	
	public Masajista() {
		super();
		this.titulacion="Titulacion predeterminada";
		this.anyosExperiencia=0;
	}
	
	public Masajista(int newId, String newN, String newAp, int newEd,String newT,int newAEx) {
		super(newId,newN,newAp,newEd);
		this.titulacion=newT;
		this.anyosExperiencia=newAEx;
	}
	
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}

	public void setAnyosExperiencia(int anyosExperiencia) {
		this.anyosExperiencia = anyosExperiencia;
	}

	public void darMasaje() {
		System.out.println("El masajista "+super.getNombre()+" con titulacion "+this.getTitulacion()+ " y "+ this.getAnyosExperiencia() +" anyos de experiencia procede a darnos un masaje.");
	}
	
	public void entrenamiento() {
		System.out.println("El masajista asisten en un entrenamiento");
	}
}
