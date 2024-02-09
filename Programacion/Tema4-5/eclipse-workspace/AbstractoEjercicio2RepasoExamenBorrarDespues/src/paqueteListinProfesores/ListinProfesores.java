package paqueteListinProfesores;

import paqueteProfesor.Profesor;
import java.util.ArrayList;

public class ListinProfesores {
	private ArrayList <Profesor> listaProf;
	
	public ListinProfesores() {
		listaProf=new ArrayList();
	}

	 public void addProfesor (Profesor profesor) {
		 listaProf.add(profesor);
	 }

	 public void imprimirListin() {
		 for(Profesor nuevoProfesor:listaProf) {
			 nuevoProfesor.mostrarDatos();
		 }
	 }

	 public double importeTotalNominaProfesorado() {
		 double nominasProf=0;
		 for(Profesor nuevoProfesor:listaProf) {
			 nominasProf=nominasProf+nuevoProfesor.getSalario();
		 }
		 return nominasProf;
	 }
	
}
