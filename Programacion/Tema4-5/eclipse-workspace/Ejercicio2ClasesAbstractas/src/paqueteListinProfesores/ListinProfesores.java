package paqueteListinProfesores;
import paquetePersona.Persona;
import paqueteProfesor.Profesor;
import paqueteProfesorInterino.ProfesorInterino;
import paqueteProfesorTitular.ProfesorTitular;

import java.util.ArrayList;
public class ListinProfesores {
	private ArrayList<Profesor> listaProfesores;
	
	public ListinProfesores() {
		this.listaProfesores=new ArrayList();
	}
	
	 public void addProfesor (Profesor profesor) {
		 listaProfesores.add(profesor);
	 }

	 public void imprimirListin() {
		 for(int i=0;i<listaProfesores.size();i++) {
			 listaProfesores.get(i).mostrarDatos();
			 if(listaProfesores.get(i) instanceof ProfesorInterino) {
				 System.out.println("Este profesor es un profesor interino");
				 System.out.println("\n");
			 }else if(listaProfesores.get(i) instanceof ProfesorTitular) {
				 System.out.println("Este profesor es un profesor titular");
				 System.out.println("\n");
			 }
		 }
	 }

	 public float importeTotalNominaProfesorado() {
		 float nominaTotal=0;
		 for(int i=0;i<listaProfesores.size();i++) {
			 nominaTotal=nominaTotal+listaProfesores.get(i).getSalario();
		 }
		 return nominaTotal;
	 }
}
