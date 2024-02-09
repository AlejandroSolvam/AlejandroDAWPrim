package paqueteProfesorTitular;

import paqueteProfesor.Profesor;

public class ProfesorTitular extends Profesor{
	
	public ProfesorTitular(String newN,String newAp,int newEd,String newIdP,float newS) {
		super(newN,newAp,newEd,newIdP,newS);
		}
	
	public void mostrarDatos() {
		 System.out.println("Nombre: "+this.getNombre() + " |Apellidos: " + this.getApellidos() + " |Edad: " + this.getEdad() + " |Id Profesor: " +  this.getIdProfesor() + " |Salario: " + this.getSalario());
		 }
}
