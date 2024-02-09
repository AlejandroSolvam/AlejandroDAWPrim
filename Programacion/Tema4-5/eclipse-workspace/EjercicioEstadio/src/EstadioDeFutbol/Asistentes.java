package EstadioDeFutbol;
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
5. Veure la quantitat de socis assistents i el seu nom */
public class Asistentes {
	private String nombre;
	private int edad;
	private boolean sonSocis;
	private int codigoAsistente;
	private static int cantidadSocis;
	
	public Asistentes() {
		this.nombre="";
		this.edad=0;
		this.sonSocis=false;
		this.codigoAsistente=0;
	}
	
	public Asistentes(String name, int ed, boolean esS, int codAs) {
		this.nombre=name;
		this.edad=ed;
		this.sonSocis=esS;
		this.codigoAsistente=codAs;
		if(this.sonSocis==true) {
			cantidadSocis++;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String newN) {
		this.nombre=newN;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int newE) {
		this.edad=newE;
	}
	
	public boolean getSonSocis() {
		return this.sonSocis;
	}
	
	public void setSonSocis(boolean newS) {
		this.sonSocis=newS;
	}
	
	public int getCodigoAsistente() {
		return this.codigoAsistente;
	}
	
	public void setCodigoAsistente(int newCA) {
		this.codigoAsistente=newCA;
	}
	
	public static void restarSoci() {
		cantidadSocis--;
	}
	
	public static int devolverTotalSoci() {
		return cantidadSocis;
	}
	
	
}
