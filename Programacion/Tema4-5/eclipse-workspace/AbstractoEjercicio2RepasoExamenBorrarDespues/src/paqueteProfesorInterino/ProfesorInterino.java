package paqueteProfesorInterino;

import paqueteProfesor.Profesor;
import java.util.Calendar;
public class ProfesorInterino extends Profesor{
	
	private Calendar fechaComienzoInterinidad;
	
	public ProfesorInterino(String newN, String newAp, int newE, String newIdP, double newS,Calendar newCal) {
		super(newN,newAp,newE,newIdP,newS);
		this.fechaComienzoInterinidad=newCal;
	}

	public Calendar getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}

	public void setFechaComienzoInterinidad(Calendar fechaComienzoInterinidad) {
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}

	public void mostrarDatos() {
		System.out.println("ProfesorInterino [getFechaComienzoInterinidad()=" + getFechaComienzoInterinidad() + ", getIdProfesor()="
				+ getIdProfesor() + ", getSalario()=" + getSalario() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + "]");
		System.out.println("Es un profesor interino");
	}

}
