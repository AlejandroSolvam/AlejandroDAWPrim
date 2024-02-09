package paqueteProfesor;
import paquetePersona.Persona;

public abstract class Profesor extends Persona {
	private String IdProfesor; 
	private float salario;
	
	public Profesor(String newN,String newAp,int newEd,String newIdP,float newS) {
		super(newN,newAp,newEd);
		this.IdProfesor=newIdP;
		this.salario=newS;
	}
	
	public void setIdProfesor (String newIdProfesor) {
		this.IdProfesor=newIdProfesor;
	}
	 public String getIdProfesor() {
		 return this.IdProfesor;
	 }
	 
	 public void setSalario(float newSalario) {
			this.salario=newSalario;
		}
	public float getSalario() {
			return this.salario;
		 }

	abstract public void mostrarDatos();
	
}
