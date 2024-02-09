package paqueteEdificio;

public abstract class Edificio {
	private int cantidadAscensores;
	
	public Edificio() {
		this.cantidadAscensores=3;
	}
	
	public Edificio(int newAsc) {
		this.cantidadAscensores=newAsc;
	}
	
	public int getCantidadAscensores() {
		return cantidadAscensores;
	}

	public void setCantidadAscensores(int cantidadAscensores) {
		this.cantidadAscensores = cantidadAscensores;
	}
	
	public abstract String toString();
	public abstract double hallarImpuesto();
}
