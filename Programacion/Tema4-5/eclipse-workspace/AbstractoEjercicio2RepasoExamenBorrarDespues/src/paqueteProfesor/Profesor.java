package paqueteProfesor;

import paquetePersona.Persona;

public abstract class Profesor extends Persona{
	private String idProfesor;
	private double salario;
	
	public Profesor() {
		super();
		this.idProfesor="Id predeterminado";
		this.salario=0;
	}
	
	public Profesor(String newN, String newAp, int newE, String newIdP,double newS) {
		super(newN,newAp,newE);
		this.idProfesor=newIdP;
		this.salario=newS;
	}

	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract void mostrarDatos();
}
