package paqueteDiputado;

import paqueteLegislador.Legislador;
public class Diputado extends Legislador {
	
	public Diputado(String newN,String newAp,int newEd, String newProv) {
		super(newN,newAp,newEd, newProv);
		
	}
	
	public String getCamaraEnQueTrabaja() {
		return "Esta persona es un diputado";
	}
}
