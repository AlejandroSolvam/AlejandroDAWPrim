package Ejercicio1;
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

import java.util.ArrayList;

public class RegistroDeEstudiantes {
	
	private ArrayList <Estudiante> arrayEstud=new ArrayList();
	
	public void agregarEstudiant(Estudiante miEstudiante) {
		arrayEstud.add(miEstudiante);
	 }
	
	public int size() {
		return arrayEstud.size();
	}
	
	public Estudiante get(int i) {
		return arrayEstud.get(i);
	}
	
	 public void ingresarNotas(Estudiante newEstudiante, double nota) {
		 
		 for (int i = 0; i < arrayEstud.size(); i++) {
	            Estudiante variableEst = arrayEstud.get(i);
	            if (variableEst.equals(newEstudiante)) {
	            	newEstudiante.setNota(nota);
	                break;
	            }
		 }
	 }
	 
	 public double calcularPromedioNotas() {
		 double suma = 0.0;
	        int contador = 0;
	        for (int i = 0; i < arrayEstud.size(); i++) {
	            Estudiante variableEst = arrayEstud.get(i);
	                suma = suma + variableEst.getNota();
	                contador++;
	            }
	        
	        if (contador > 0) {
	            return suma/contador;
	        }else{
	            return 0.0;
	        }
	 }
	 
	 public void mostrarListaDeEstudiants() {
		 for (int i = 0; i < arrayEstud.size(); i++) {
	            Estudiante variableEst = arrayEstud.get(i);
	            System.out.println("Nombre: " + variableEst.getNombre() + ", Apellido: " + variableEst.getApellido() +
	                    ", NumEstudiante: " + variableEst.getNumEstudiante() + ", Nota: " + variableEst.getNota());
	        }
	 }
	 
}
