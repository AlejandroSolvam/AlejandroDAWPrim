package paqueteProgramador;

import paqueteEmpleado.Empleado;
public class Programador extends Empleado{
	private int lineasDeCodigoPorHora;
	private String lenguajeDominado;
	
	public Programador() {
		super();
		this.lineasDeCodigoPorHora=0;
		this.lenguajeDominado="lenguaje Predeterminado";
	}
	
	public Programador(String newN, String newAp, int newCE, int newE, boolean estaC,double newS, int lin, String leng) {
		super(newN,newAp,newCE,newE,estaC,newS);
		this.lineasDeCodigoPorHora=lin;
		this.lenguajeDominado=leng;
	}

	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}

	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}

	public String getLenguajeDominado() {
		return lenguajeDominado;
	}

	public void setLenguajeDominado(String lenguajeDominado) {
		this.lenguajeDominado = lenguajeDominado;
	}

	@Override
	public String toString() {
		return "Programador [getLineasDeCodigoPorHora()=" + getLineasDeCodigoPorHora() + ", getLenguajeDominado()="
				+ getLenguajeDominado() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos()
				+ ", getCod_empleado()=" + getCod_empleado() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado()
				+ ", getSalario()=" + getSalario() + "]";
	}
}
