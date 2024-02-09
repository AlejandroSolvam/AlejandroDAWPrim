package paqueteLegislador;

import paquetePersona.Persona;
public abstract class Legislador extends Persona {
	private String provinciaQueRepresenta;
	
	public Legislador() {
		super();
		this.provinciaQueRepresenta="Provincia Predeterminada";
	}
	
	public Legislador(String newN, String newAp, int newEd, String newP) {
		super(newN,newAp,newEd);
		this.provinciaQueRepresenta=newP;
	}

	public String getProvinciaQueRepresenta() {
		return provinciaQueRepresenta;
	}

	public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
		this.provinciaQueRepresenta = provinciaQueRepresenta;
	}
	
	public abstract String getCamaraEnQueTrabaja();
}
