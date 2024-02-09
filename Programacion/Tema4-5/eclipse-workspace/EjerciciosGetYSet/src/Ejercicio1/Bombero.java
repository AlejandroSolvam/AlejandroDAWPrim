package Ejercicio1;
/* Exercici 1
Defineix una classe Bomber considerant els següents atributs de classe: nom (String), cognoms (String),
edat (int), casat (boolean), especialista (boolean). Defineix un constructor que reba els paràmetres
necessaris per a la inicialització i els mètodes per a poder establir i obtindre els valors dels atributs.
Compila el codi per a comprovar que no presenta errors, crea un objecte i comprova que s'inicialitza
correctament consultant el valor dels seus atributs després d'haver creat l'objecte.  */
public class Bombero {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;
	private boolean especialista;
	
	Bombero(){
		this.nombre="Tomas";
		this.apellido="Lopez";
		this.edad=35;
		this.casado=true;
		this.especialista=false;
	}
	
	Bombero(String nam,String apell, int ed, boolean cas, boolean espec){
		this.setNombre(nam);
		this.setApellido(apell);
		this.setEdad(ed);
		this.setCasado(cas);
		this.setEspecialista(espec);
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setNombre(String newName) {
		this.nombre=newName;
	}
	
	String getApellido() {
		return this.apellido;
	}
	
	void setApellido(String newApell) {
		this.apellido=newApell;
	}
	
	int getEdad() {
		return this.edad;
	}
	
	void setEdad(int newEdad) {
		this.edad=newEdad;
	}
	
	boolean getCasado() {
		return this.casado;
	}
	
	void setCasado(boolean newCasado) {
		this.casado=newCasado;
	}
	
	boolean getEspecialista() {
		return this.especialista;
	}
	
	void setEspecialista(boolean newEspecialista) {
		this.especialista=newEspecialista;
	}
}
