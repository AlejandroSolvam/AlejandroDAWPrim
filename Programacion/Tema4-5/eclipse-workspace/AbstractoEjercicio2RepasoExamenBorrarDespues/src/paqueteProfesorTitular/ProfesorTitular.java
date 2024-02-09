package paqueteProfesorTitular;

import paqueteProfesor.Profesor;

public class ProfesorTitular extends Profesor{
	private int asignaturas;
	
	public ProfesorTitular() {
		super();
		this.asignaturas=0;
	}
	
	public ProfesorTitular(String newN, String newAp, int newE, String newIdP, double newS,int newAs) {
		super(newN,newAp,newE,newIdP,newS);
		this.asignaturas=newAs;
	}

	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	public void mostrarDatos() {
		System.out.println("ProfesorTitular [getAsignaturas()=" + getAsignaturas() + ", getIdProfesor()=" + getIdProfesor()
		+ ", getSalario()=" + getSalario() + ", getNombre()=" + getNombre() + ", getApellidos()="
		+ getApellidos() + ", getEdad()=" + getEdad() + "]");
		System.out.println("Es un profesor titular");
	}

	
	
}
