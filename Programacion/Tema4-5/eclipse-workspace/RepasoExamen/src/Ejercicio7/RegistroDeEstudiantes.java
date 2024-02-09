package Ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;
/* Exercicis amb ArrayList
Exercici 1
Crea un programa per a gestionar un registre d'estudiants i les seues notes.
Has d'implementar les següents classes:
• Estudiant: Representa a un estudiant amb atributs com a nom, cognom i número d'estudiant.
• RegistreEstudiants: Representa el registre que contindrà una col·lecció d'estudiants i les seues notes. Ha de
tindre mètodes per a agregar un estudiant, ingressar notes per a un estudiant i calcular la mitjana de notes
d'un estudiant.
• Prova: Classe principal que conté el mètode main on es realitza la interacció amb l'usuari.
Requisits:
• Usa la classe ArrayList per a emmagatzemar la col·lecció d'estudiants en la classe RegistreEstudiants.
class RegistreEstudiants {
 ArrayList<Estudiant> estudiants = new ArrayList();
 public void agregarEstudiant(Estudiant estudiant) {
 }
 public void ingresarNotas(Estudiant estudiant, double nota) {
 }
 public double calcularPromedioNotas() {
 }
 public void mostrarListaDeEstudiants() {
 }
}
• Implementa un menú interactiu en el mètode main que permeta a l'usuari realitzar les següents accions:
• Agregar un nou estudiant al registre.
• Ingressar notes per a un estudiant.
• Calcular la mitjana de notes.
• Mostrar la llista completa d'estudiants i les seues notes.
• Eixir del programa. */
public class RegistroDeEstudiantes {
	private ArrayList <Estudiante> listaEstudiantes;
	Scanner Introducir=new Scanner(System.in);
	
	RegistroDeEstudiantes(){
		listaEstudiantes=new ArrayList();
	}
	
	public void agregarEstudiante(Estudiante newEstudiante) {
		listaEstudiantes.add(newEstudiante);
	}
	
	public void ingresarNotas(Estudiante newEstudiante,double nota) {
		if(listaEstudiantes.isEmpty()) {
			System.out.println("No existe ningun estudiante.");
		}else{
			for(Estudiante estudiante:listaEstudiantes) {
				if(estudiante.equals(newEstudiante)) {
					estudiante.setNota(nota);
					break;
				}
			}
		}
	}
	
	public double calcularPromedioNotas() {
		if(listaEstudiantes.isEmpty()) {
			System.out.println("No existe ningun estudiante.");
			return 0.0;
		}else{
			double notaTotal=0;
			for(Estudiante estudiante:listaEstudiantes) {
				notaTotal=notaTotal+estudiante.getNota();
				}
			return notaTotal/listaEstudiantes.size();
			}
		}
	
	public void mostrarEstudiantes() {
		if(listaEstudiantes.isEmpty()) {
			System.out.println("No existe ningun estudiante.");
		}else{
			for(Estudiante estudiante:listaEstudiantes) {
				System.out.println(estudiante.getNumeroEstudiante()+" "+estudiante.getNombre()+" "+estudiante.getApellido()+" "+estudiante.getNota());
				}
			}
		}
	
	public int size() {
		return listaEstudiantes.size();
	}
	
	public Estudiante get(int i) {
		return listaEstudiantes.get(i);
	}
}
