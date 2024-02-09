package Ejercicio1;
/* Crea una clase 'Caja' que utilice un método para inicializar las dimensiones de la caja por
 *  parámetro (altura, anchura y profundidad de tipo double). 
 *  La clase debe tener un método que devuelva el valor del volumen. 

Crea un objeto de la clase e imprime el volumen correspondiente en la función main(). */
public class Caja {

	private double altura;
	private double anchura;
	private double profundidad;
	
	Caja(){
		this.altura=5.7;
		this.anchura=2.5;
		this.profundidad=1.8;
		}
	
	Caja(double alt, double anc, double prof){
		this.altura=alt;
		this.anchura=anc;
		this.profundidad=prof;
		}
	
	double getVolumenCaja() {
		return altura*anchura*profundidad;
	}
	
	
}
