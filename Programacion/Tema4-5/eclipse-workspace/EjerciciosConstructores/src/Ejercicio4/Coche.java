package Ejercicio4;
/* 4. Crea la clase coche.
Atributo de la clase: velocidad.
Crea dos constructores:
Uno no toma parámetros y el otro sí.
Los dos constructores inicializarán la variable velocidad.
Realiza los métodos get y set para la velocidad */
public class Coche {
	
	private double velocidad;
	
	Coche(){
		this.velocidad=0;
	}
	
	Coche(double veloc){
		this.velocidad=veloc;
	}
	
	public double getVelocidad() {
		return this.velocidad;
	}
	
	public void setVelocidad(double nuevaVel) {
		this.velocidad=nuevaVel;
	}
}
