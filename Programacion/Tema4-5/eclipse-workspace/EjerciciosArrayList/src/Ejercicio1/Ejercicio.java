package Ejercicio1;


import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seguir=true;
		RegistroDeEstudiantes regEst=new RegistroDeEstudiantes();
	while(seguir!=false) {	
		
		Scanner Introducir=new Scanner(System.in);
		int opcion=0;
		double nota=0;
		
		System.out.println("Bienvenido al menu de estudiante, escoge la opción que quieres realizar:");
		System.out.println("1. Agregar un nou estudiant al registre.");
		System.out.println("2. Ingressar notes per a un estudiant.");
		System.out.println("3. Calcular la mitjana de notes.");
		System.out.println("4. Mostrar la llista completa d'estudiants i les seues notes.");
		System.out.println("5. Eixir del programa.");
		opcion=Introducir.nextInt();
		
		switch(opcion) {
		case 1:
			String name="";
			String apellido="";
			int numExp=0;
			
			Introducir.nextLine();
			System.out.println("Introduce el nombre de estudiante:");
			name=Introducir.nextLine();
			System.out.println("Introduce el apellido del estudiante:");
			apellido=Introducir.nextLine();
			System.out.println("Introduce el numero de expendiente del estudiante:");
			numExp=Introducir.nextInt();
			
			Estudiante nuevoEstudiante=new Estudiante(name,apellido,numExp);
			
			regEst.agregarEstudiant(nuevoEstudiante);
			break;
		case 2:
			System.out.println("Introduce el numero del estudiante:");
			int numEst=Introducir.nextInt();
			System.out.println("Introduce la nota del estudiante:");
			nota=Introducir.nextDouble();
			for (int i = 0; i < regEst.size(); i++) {
	            Estudiante variableEst = regEst.get(i);
	            if (numEst==variableEst.getNumEstudiante()) {
	            	variableEst.setNota(nota);
	            	regEst.ingresarNotas(variableEst, nota);
	                break;
	            	}
	            }
			break;
		case 3:
			System.out.println("El promedio de la nota de todos los alumnos es de:"+regEst.calcularPromedioNotas());
			break;
		case 4:
			regEst.mostrarListaDeEstudiants();
			break;
		case 5:
			seguir=false;
			break;
		}
	  }
	}
  }
