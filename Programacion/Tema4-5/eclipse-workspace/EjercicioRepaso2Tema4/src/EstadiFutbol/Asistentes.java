package EstadiFutbol;
/* Exercici de repàs
Un Estadi de Futbol vol en tot moment tenir el control de tots els assistents al estadi cada partit.
Dels assistents es vol saber: El nom, la edat i si son socis.
Els assistents a cada partit estaran guardats a un ArrayList de assistents.
El màxim de assistents a cada partit serà de 15000 assistents.
La quantitat de socis es vol controlar mitjançant una variable de classe.
Per a portar aquest control, tindrem el següent menú:
1. Entra assistent
2. Ix assistent
3. Veure la quantitat de assistents amb tots els seus atributs.
5. Veure la quantitat de socis assistents i el seu nom. */
public class Asistentes {
	
	private String nombre;
	private int edad;
	private boolean sonSocis;
	private int codigoAsistente;
	private static int numAsistentes;
	
	public Asistentes(){
		this.nombre="UsuarioPredeterminado";
		this.edad=0;
		this.sonSocis=false;
		this.codigoAsistente=000;
		if(this.sonSocis==true) {
			numAsistentes++;
		}
	}
	
	public Asistentes(String newN,int newE, boolean esS,int codAsist){
		this.nombre=newN;
		this.edad=newE;
		this.sonSocis=esS;
		this.codigoAsistente=codAsist;
		if(this.sonSocis==true) {
			numAsistentes++;
		}
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setNombre(String name) {
		this.nombre=name;
	}
	
	int getEdad() {
		return this.edad;
	}
	
	void setEdad(int ed) {
		this.edad=ed;
	}
	
	boolean getEsSocio() {
		return this.sonSocis;
	}
	
	void setEsSocio(boolean esS) {
		this.sonSocis=esS;
	}
	
	int getCodigoAsistente() {
		return this.codigoAsistente;
	}
	
	void setcodigoAsistente(int codAs) {
		this.codigoAsistente=codAs;
	}
	
	static int getnumAsistentes() {
		return numAsistentes;
	}
	
	static void borrarSocio() {
		numAsistentes--;
	}
	
}
