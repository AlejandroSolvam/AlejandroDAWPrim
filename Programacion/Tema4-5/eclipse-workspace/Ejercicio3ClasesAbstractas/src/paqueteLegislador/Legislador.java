package paqueteLegislador;

import paquetePersona.Persona;
public abstract class Legislador extends Persona {
	private String provinciaQueRepresenta;
	
	public Legislador(String newN,String newAp,int newEd,String prov) {
		super(newN,newAp,newEd);
		this.provinciaQueRepresenta=prov;
	}
	 abstract public String getCamaraEnQueTrabaja();
}
