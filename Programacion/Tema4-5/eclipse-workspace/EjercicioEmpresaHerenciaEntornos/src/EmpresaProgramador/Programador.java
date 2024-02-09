package EmpresaProgramador;
import EmpresaEmpleado.Empleado;
/* Programador (Especialització de Empleat). Classe que hereta de Empleat tots els atributs i mètodes.
- Atributs:
- liniesDeCodiPerHora: tipus enter
- llenguatgeDominant: tipus cadena
- Mètodes:
- Constructor amb i sense paràmetres de entrada. */
public class Programador extends Empleado {
	private int lineasDeCodigoPorHora;
	private String lenguajeDominado;
	
	public Programador(){
		super();
		this.lineasDeCodigoPorHora=0;
		this.lenguajeDominado="Lenguaje Predeterminado";
	}
	
	public Programador(String newN, String newAp, String newC, int newE, boolean esC, double newS, int newLineasCod, String newLeng){
		super(newN,newAp,newC,newE,esC,newS);
		this.lineasDeCodigoPorHora=newLineasCod;
		this.lenguajeDominado=newLeng;
	}
	
	int getLineasCodigo() {
		return this.lineasDeCodigoPorHora;
	}
	
	void setLineasCodigo(int newLiC) {
		this.lineasDeCodigoPorHora=newLiC;
	}
	
	String getLenguajeDominado() {
		return this.lenguajeDominado;
	}
	
	void setLenguajeDominado(String newLeng) {
		this.lenguajeDominado=newLeng;
	}

}
