package paquetePrueba;

import paqueteProfesor.Profesor;
import paqueteProfesorTitular.ProfesorTitular;
import paqueteProfesorInterino.ProfesorInterino;
import paqueteListinProfesores.ListinProfesores;
import java.util.Calendar;

public class Prueba {
	 public static void main (String [ ] Args) {
	 Calendar fecha1 = Calendar.getInstance();
	 fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre

	 ProfesorInterino pi1 = new ProfesorInterino("José", "Hernández López", 45, "45221887-K",1200.23, fecha1);
	 ProfesorInterino pi2 = new ProfesorInterino("Andrés", "Moltó Parra", 87, "72332634-L", 1500.34, fecha1);
	 ProfesorInterino pi3 = new ProfesorInterino ("José", "Ríos Mesa", 76, "34998128-M", 1730.67, fecha1);

	 ProfesorTitular pt1 = new ProfesorTitular ("Juan", "Pérez Pérez", 23, "73-K", 2421.43, 4);
	 ProfesorTitular pt2 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "88-L", 2312.78, 2);
	 ProfesorTitular pt3 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "81-F", 3160.67, 5);
	 
	 ListinProfesores listinProfesorado = new ListinProfesores ();
	 listinProfesorado.addProfesor (pi1);
	 listinProfesorado.addProfesor(pi2);
	 listinProfesorado.addProfesor (pi3);
	 listinProfesorado.addProfesor (pt1);
	 listinProfesorado.addProfesor(pt2);
	 listinProfesorado.addProfesor (pt3);
	 listinProfesorado.imprimirListin();

	 System.out.println ("El importe de las nóminas del profesorado que consta en el listín es " +
	 listinProfesorado.importeTotalNominaProfesorado()+ " euros");
	 }
	} 
