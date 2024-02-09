package Ejercicio8.Ejecutable;
import Ejercicio8.Curso.Asignatura;

import java.util.Scanner;

import Ejercicio7.RegistroCoches;
import Ejercicio8.Curso.Alumno;
public class Ejecutable {

	public static void main(String[] args) {
		Scanner Introducir=new Scanner(System.in);
		Alumno primerAlumno=new Alumno("Alejandro",20);
		Alumno segundoAlumno=new Alumno("Tobias",25);
		
		primerAlumno.modificarNotaAsignatura("Programacion", 9.4);
		primerAlumno.modificarNotaAsignatura("BaseDeDatos", 4.2);
		primerAlumno.modificarNotaAsignatura("Sistemas", 8.6);
		primerAlumno.modificarNotaAsignatura("PaginasWeb", 7.7);
		
		System.out.println("");
		
		segundoAlumno.modificarNotaAsignatura("Programacion", 6.6);
		segundoAlumno.modificarNotaAsignatura("BaseDeDatos", 4.9);
		segundoAlumno.modificarNotaAsignatura("Sistemas", 3.4);
		segundoAlumno.modificarNotaAsignatura("PaginasWeb", 9.8);
		
		primerAlumno.mostrarAlumno();
		
		System.out.println("");
		
		segundoAlumno.mostrarAlumno();
		


			
	
	}

}
