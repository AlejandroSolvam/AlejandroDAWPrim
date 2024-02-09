package Ejercicio4;
/* • Información: Marca, Velocidad, Ram, HD, Cargado 

• Acciones:

▫ ampliar memoria

▫ cargar

▫ devolver la marca

 */

public class Portatil {

	private String Marca;
	private double Velocidad;
	private int Ram;
	private double HD;
	private boolean Cargado;
	
	Portatil(String marc, double vel, int Rm, double discoDuro, boolean carg){
		this.Marca=marc;
		this.Velocidad=vel;
		this.Ram=Rm;
		this.HD=discoDuro;
		this.Cargado=carg;
	}
	
	void ampliarMemoria(int mas) {
		this.Ram=this.Ram+mas;
	}
	
	void cargar() {
		this.Cargado=true;
	}
	
	String devolverMarca() {
		return this.Marca;
	}
	
	int getRam() {
		return this.Ram;
	}
	
	boolean getCargado() {
		return this.Cargado;
	}
}
