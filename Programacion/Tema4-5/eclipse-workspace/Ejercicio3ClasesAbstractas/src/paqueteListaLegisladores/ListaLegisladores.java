package paqueteListaLegisladores;

import java.util.ArrayList;
import paqueteLegislador.Legislador;
import paqueteDiputado.Diputado;
import paqueteSenador.Senador;

public class ListaLegisladores {
	ArrayList<Legislador> listaLegisladores;
	
	public ListaLegisladores() {
		listaLegisladores=new ArrayList();
	}
	
	public void añadirLegislador(Legislador newLeg) {
		listaLegisladores.add(newLeg);
	}
	
	public void verTipoLegislador() {
		for(int i=0;i<listaLegisladores.size();i++) {
			System.out.println(listaLegisladores.get(i).getNombre() + " " + listaLegisladores.get(i).getApellidos() + " " + listaLegisladores.get(i).getEdad());
			System.out.println(listaLegisladores.get(i).getCamaraEnQueTrabaja());
		}
	}
}
