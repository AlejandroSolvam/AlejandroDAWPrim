package paqueteSenador;

import paqueteLegislador.Legislador;
public class Senador extends Legislador {
	
	public Senador(String newN,String newAp,int newEd,String newProv) {
		super(newN,newAp,newEd, newProv);
	}
	
	public String getCamaraEnQueTrabaja() {
		return "Esta persona es un senador";
	}
}
