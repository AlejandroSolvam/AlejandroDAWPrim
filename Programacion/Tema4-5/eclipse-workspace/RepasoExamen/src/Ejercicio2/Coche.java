package Ejercicio2;
/* 4. Crea la clase coche.
Atributo de la clase: velocidad.
Crea dos constructores:
Uno no toma parámetros y el otro sí.
Los dos constructores inicializarán la variable velocidad.
Realiza los métodos get y set para la velocidad.
Crea dos objetos para probar su funcionamiento (cada objeto llama a un constructor distinto) y
verifica que todo funciona correctamente. */
public class Coche {
	private int velocidad;
	
	Coche(){
		this.velocidad=0;
	}
	
	Coche(int newV){
		this.velocidad=newV;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public void setVelocidad(int vel) {
		this.velocidad=vel;
	}
}
