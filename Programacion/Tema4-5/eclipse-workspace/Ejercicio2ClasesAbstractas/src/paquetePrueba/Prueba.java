package paquetePrueba;

import java.util.Calendar;
import paquetePersona.Persona;
import paqueteProfesor.Profesor;
import paqueteProfesorInterino.ProfesorInterino;
import paqueteProfesorTitular.ProfesorTitular;
import paqueteListinProfesores.ListinProfesores;

public class Prueba {
 public static void main (String [ ] Args) {
 Calendar fecha1 = Calendar.getInstance();
 fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre

 ProfesorInterino pi1 = new ProfesorInterino("José", "Hernández López", 45, "45221887-K", 1000, fecha1);
 ProfesorInterino pi2 = new ProfesorInterino("Andrés", "Moltó Parra", 87, "72332634-L", 1500, fecha1);
 ProfesorInterino pi3 = new ProfesorInterino ("José", "Ríos Mesa", 76, "34998128-M", 2000, fecha1);

 ProfesorTitular pt1 = new ProfesorTitular ("Juan", "Pérez Pérez", 23, "73-K", 1350);
 ProfesorTitular pt2 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "88-L", 1700 );
 ProfesorTitular pt3 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "81-F", 1930);

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