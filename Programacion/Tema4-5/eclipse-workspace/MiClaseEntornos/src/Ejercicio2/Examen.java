package Ejercicio2;

public class Examen {
	
	private int Unidad;
	private String Alumno;
	private String Asignatura;
	private double Calificación;
	
	Examen(int un, String newAl, String asig, double cal){
		this.Unidad=un;
		this.Alumno=newAl;
		this.Asignatura=asig;
		this.Calificación=cal;
	}
	
	int getUnidad() {
		return this.Unidad;
	}
	
	String getNombreAlumno() {
		return this.Alumno;
	}
	
	String getAsignatura() {
		return this.Alumno;
	}
	
	boolean getCalificacion() {
		if(Calificación>5) {
			return true;
		}
			return false;
	}
	
	double getCalificacionTotal() {
		return this.Calificación;
	}
	
	void sumarPunto() {
		this.Calificación=Calificación+1;
	}
	
}
