package Ejercicio3;
/* • Información: Nombre, Edad, Dirección, Curso, Teléfono 

• Acciones:

▫ devolver el nombre del alumno

▫ cumplir años

▫ devolver el teléfono */
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1=new Alumno("Alejandro",21,"Av 9 de Octubre","1ºDAW",634554734);
		System.out.println(alumno1.getNombreAlumno());
		alumno1.cumplirAños();
		System.out.println(alumno1.getEdad());
		System.out.println(alumno1.getTelefono());
	}

}
