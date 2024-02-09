package paquetePersona;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona() {
		this.nombre="Nombre predeterminado";
		this.apellidos="Apellido predeterminado";
		this.edad=0;
	}
	
	public Persona(String newN, String newAp, int newE) {
		this.nombre=newN;
		this.apellidos=newAp;
		this.edad=newE;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
