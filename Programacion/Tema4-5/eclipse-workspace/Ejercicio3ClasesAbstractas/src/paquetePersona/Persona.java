package paquetePersona;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String newN,String newAp,int newEd) {
		this.nombre=newN;
		this.apellidos=newAp;
		this.edad=newEd;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
}
