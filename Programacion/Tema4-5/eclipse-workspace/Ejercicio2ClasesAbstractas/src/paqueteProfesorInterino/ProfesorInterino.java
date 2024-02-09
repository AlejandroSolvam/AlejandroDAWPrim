package paqueteProfesorInterino;
import paqueteProfesor.Profesor;

import java.util.Calendar;
public class ProfesorInterino extends Profesor{
	
	private Calendar fechaComienzoInterinidad;
	public ProfesorInterino(String newN,String newAp,int newEd,String newIdP, float newS, Calendar newC) {
		super(newN,newAp,newEd,newIdP,newS);
		fechaComienzoInterinidad=newC;
	}
	
	public Calendar getFechaComienzoInterinidad () {
		 return fechaComienzoInterinidad;
	}
	
	public void mostrarDatos() {
		 System.out.println("|Nombre: "+this.getNombre() + " |Apellidos: " + this.getApellidos() + " |Edad: " + this.getEdad() + " |Id Profesor: " +  this.getIdProfesor() + " |Salario: " + this.getSalario() +" |Fecha del comienzo de interinidad y hora: "+this.getFechaComienzoInterinidad().getTime());
		 }
		 
}
