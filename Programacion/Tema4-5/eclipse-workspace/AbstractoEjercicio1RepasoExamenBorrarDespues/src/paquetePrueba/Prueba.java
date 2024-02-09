package paquetePrueba;

import paqueteListaLegisladores.ListaLegisladores;
import paqueteLegislador.Legislador;
import paqueteDiputado.Diputado;
import paqueteSenador.Senador;

public class Prueba {
	public static void main(String[]args) {
		ListaLegisladores nuevaLista=new ListaLegisladores();
		
		Legislador legis1=new Diputado("Antonio","Cabrera",18,"Murcia");
		Legislador legis2=new Diputado("Javi","Maroto",32,"Cantabria");
		Legislador legis3=new Senador("Tomas","Hernandez",21,"Zaragoza");
		Legislador legis4=new Senador("Manolo","Espinosa",56,"Madrid");
		
		nuevaLista.añadirLegislador(legis1);
		nuevaLista.añadirLegislador(legis2);
		nuevaLista.añadirLegislador(legis3);
		nuevaLista.añadirLegislador(legis4);
		
		nuevaLista.mostrarLegisladores();
	}
}
