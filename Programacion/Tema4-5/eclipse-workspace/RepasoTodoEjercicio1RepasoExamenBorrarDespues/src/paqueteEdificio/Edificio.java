package paqueteEdificio;

public abstract class Edificio {
	private int cantidadAscensores;
	
	public Edificio() {
		this.cantidadAscensores=2;
	}
	
	public Edificio(int canAs) {
		this.cantidadAscensores=canAs;
	}
	
	public int getCantidadAscensores() {
		return cantidadAscensores;
	}

	public void setCantidadAscensores(int cantidadAscensores) {
		this.cantidadAscensores = cantidadAscensores;
	}

	public abstract double hallarImpuesto();
	public abstract void mostrarDatos();
}
