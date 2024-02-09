package paqueteDiputado;

import paqueteLegislador.Legislador;

public class Diputado extends Legislador{
	
	public Diputado() {
		super();
	}
	
	public Diputado(String newN, String newAp, int newEd, String newP) {
		super(newN,newAp,newEd,newP);
	}
	
	public String getCamaraEnQueTrabaja() {
		return "Trabaja como diputado";
	}
}
