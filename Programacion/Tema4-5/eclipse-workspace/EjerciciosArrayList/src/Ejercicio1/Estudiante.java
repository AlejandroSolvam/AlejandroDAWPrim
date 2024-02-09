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

public class Estudiante {
	private String nombre;
	private String apellido;
	private int numEstudiante;
	private double nota;
	
	Estudiante(String name, String ap, int numEst, double newNota){
		this.setNombre(name);
		this.setApellido(ap);
		this.setNumEstudiante(numEst);
		this.nota=newNota;
	}
	
	Estudiante(String name, String ap, int numEst){
		this.setNombre(name);
		this.setApellido(ap);
		this.setNumEstudiante(numEst);
		this.nota=0;
	}
	
	Estudiante(){
		this.nombre="";
		this.apellido="";
		this.numEstudiante=0;
		this.nota=0;
	}
	
	void setNombre(String newName){
		this.nombre=newName;
	}
	
	String getNombre(){
		return this.nombre;
	}
	
	void setApellido(String newAp){
		this.apellido=newAp;
	}
	
	String getApellido(){
		return this.apellido;
	}
	
	void setNumEstudiante(int newNumEs){
		this.numEstudiante=newNumEs;
	}
	
	int getNumEstudiante(){
		return this.numEstudiante;
	}
	
	void setNota(double newN){
		this.nota=newN;
	}
	
	double getNota(){
		return this.nota;
	}
	
	 boolean equals(Estudiante estComparar) {
		 if(this.numEstudiante==estComparar.numEstudiante) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
}
