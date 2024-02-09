package Ejercicio3;
/* Exercici 1
Defineix una classe Bomber considerant els següents atributs de classe: nom (String), cognoms (String),
edat (int), casat (boolean), especialista (boolean). Defineix un constructor que reba els paràmetres
necessaris per a la inicialització i els mètodes per a poder establir i obtindre els valors dels atributs.
Compila el codi per a comprovar que no presenta errors, crea un objecte i comprova que s'inicialitza
correctament consultant el valor dels seus atributs després d'haver creat l'objecte.  */
public class Bombero {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private boolean especialista;
	
	Bombero(){
		this.nombre="";
		this.apellidos="";
		this.edad=0;
		this.casado=false;
		this.especialista=false;
	}
	
	Bombero(String newN, String newA, int newE, boolean cas, boolean esp){
		this.nombre=newN;
		this.apellidos=newA;
		this.edad=newE;
		this.casado=cas;
		this.especialista=esp;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String n){
		this.nombre=n;
	}
	
	public String getApellidos(){
		return this.apellidos;
	}
	
	public void setApellidos(String a){
		this.apellidos=a;
	}
	
	public int getEdad(){
		return this.edad;
	}
	
	public void setEdad(int e){
		this.edad=e;
	}
	
	public boolean getCasado(){
		return this.casado;
	}
	
	public void setCasado(boolean c){
		this.casado=c;
	}
	
	public boolean getEspecialista(){
		return this.especialista;
	}
	
	public void setEspecialista(boolean e){
		this.especialista=e;
	}
	
}
