package Ejercicio7;

import java.util.Scanner;
import java.util.ArrayList;

public class EjecutableEstudiante {
	
	public static void main(String[]args) {
		RegistroDeEstudiantes estudiantesTotales=new RegistroDeEstudiantes();
		boolean seguir=true;
		Scanner Introducir=new Scanner(System.in);
		while(seguir!=false) {
			System.out.println("Menu de estudiante, introduce una opcion;");
			System.out.println("1. Agregar un nou estudiant al registre.");
			System.out.println("2. Ingressar notes per a un estudiant.");
			System.out.println("3. Calcular la mitjana de notes.");
			System.out.println("4. Mostrar la llista completa d'estudiants i les seues notes.");
			System.out.println("5. Eixir del programa.");
			int opcion=Introducir.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce el nombre del estudiante;");
				String nombre=Introducir.next();
				System.out.println("Introduce el apellido del estudiante;");
				String apellido=Introducir.next();
				System.out.println("Introduce el numero de estudiante;");
				int numEs=Introducir.nextInt();
				Estudiante nuevoEstudiante=new Estudiante(nombre,apellido,numEs);
				estudiantesTotales.agregarEstudiante(nuevoEstudiante);
				break;
			case 2:
				System.out.println("Introduce el numero de estudiante al que quieres asignar la nota:");
				int variableNumEs=Introducir.nextInt();
				System.out.println("Introduce la nota:");
				double nota=Introducir.nextDouble();
				for(int i=0;i<estudiantesTotales.size();i++) {
					
					Estudiante variableEstudiante=estudiantesTotales.get(i);
					if(variableEstudiante.getNumeroEstudiante()==variableNumEs) {	
					 estudiantesTotales.ingresarNotas(variableEstudiante,nota);
					 
					}
				}
				break;
			case 3:
				estudiantesTotales.calcularPromedioNotas();
				break;
			case 4:
				estudiantesTotales.mostrarEstudiantes();
				break;
			case 5:
				seguir=false;
				break;
			default:
			}
			
			
		}
	}
	
}
