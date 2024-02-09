package paqueteSenador;

import paqueteLegislador.Legislador;

public class Senador extends Legislador{
	
	public Senador() {
		super();
	}
	
	public Senador(String newN, String newAp, int newEd, String newP) {
		super(newN,newAp,newEd,newP);
	}
	
	public String getCamaraEnQueTrabaja() {
		return "Trabaja como senador";
	}
}
