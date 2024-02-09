package Ejercicio3;
/* • Información: Nombre, Edad, Dirección, Curso, Teléfono 

• Acciones:

▫ devolver el nombre del alumno

▫ cumplir años

▫ devolver el teléfono */
public class Alumno {
	
	private String Nombre;
	private int Edad;
	private String Dirección;
	private String Curso;
	private int Teléfono;
	
	Alumno(String name, int ed, String direc, String cur, int tel){
		this.Nombre=name;
		this.Edad=ed;
		this.Dirección=direc;
		this.Curso=cur;
		this.Teléfono=tel;
	}
	
	String getNombreAlumno() {
		return this.Nombre;
	}
	
	int getTelefono() {
		return this.Teléfono;
	}
	
	void cumplirAños() {
		this.Edad=Edad+1;
	}
	
	int getEdad() {
		return this.Edad;
	}
	
}
