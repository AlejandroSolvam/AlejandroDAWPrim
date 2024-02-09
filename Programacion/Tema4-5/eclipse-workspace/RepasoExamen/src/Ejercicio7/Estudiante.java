package Ejercicio7;
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
	private double nota;
	private int numeroEstudiante;
	
	Estudiante(){
		this.nombre="";
		this.apellido="";
		this.nota=0;
		this.numeroEstudiante=0;
	}
	
	Estudiante(String name,String ap,int newN,int numE){
		this.nombre=name;
		this.apellido=ap;
		this.nota=newN;
		this.numeroEstudiante=numE;
	}
	
	Estudiante(String name,String ap,int numE){
		this.nombre=name;
		this.apellido=ap;
		this.nota=0;
		this.numeroEstudiante=numE;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String newN) {
		this.nombre=newN;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String newA) {
		this.apellido=newA;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public void setNota(double newN) {
		this.nota=newN;
	}
	
	public int getNumeroEstudiante() {
		return this.numeroEstudiante;
	}
	
	public void setNumeroEstudiante(int numE) {
		this.numeroEstudiante=numE;
	}
}
