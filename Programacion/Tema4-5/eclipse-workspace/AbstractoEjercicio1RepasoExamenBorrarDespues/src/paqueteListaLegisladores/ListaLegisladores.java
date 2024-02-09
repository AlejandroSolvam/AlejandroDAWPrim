package paqueteListaLegisladores;

import paqueteLegislador.Legislador;
import java.util.ArrayList;

public class ListaLegisladores {
	private ArrayList<Legislador> listaLeg;
	
	public ListaLegisladores() {
		listaLeg=new ArrayList();
	}
	
	public void añadirLegislador(Legislador nuevoLeg) {
		listaLeg.add(nuevoLeg);
	}
	
	public void mostrarLegisladores() {
		for(Legislador nuevoLegislador:listaLeg) {
			System.out.println(nuevoLegislador.getNombre() + " " + nuevoLegislador.getProvinciaQueRepresenta() + " " + nuevoLegislador.getCamaraEnQueTrabaja());
		}
	}
}
