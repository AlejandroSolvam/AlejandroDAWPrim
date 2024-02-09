package paquetePrueba;

import paquetePersona.Persona;
import paqueteLegislador.Legislador;
import paqueteListaLegisladores.ListaLegisladores;
import paqueteDiputado.Diputado;
import paqueteSenador.Senador;
import java.util.ArrayList;
public class Prueba {

	public static void main(String[] args) {
		ListaLegisladores nuevaLista=new ListaLegisladores();
		Diputado dip= new Diputado("pepe","gonzalez",55,"cadiz");
		Senador dip2= new Senador("Alejandro","Jimenez",20,"Valencia");
		Diputado dip3= new Diputado("Ivan","Martinez",27,"Galicia");
		Senador dip4= new Senador("Mario","Martinez",32,"Barcelona");
		
		nuevaLista.añadirLegislador(dip);
		nuevaLista.añadirLegislador(dip2);
		nuevaLista.añadirLegislador(dip3);
		nuevaLista.añadirLegislador(dip4);
		
		nuevaLista.verTipoLegislador();
		

	}

}
