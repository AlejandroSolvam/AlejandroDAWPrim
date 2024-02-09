package Ejercicio1;

/* Crea una clase 'Caja' que utilice un método para inicializar las dimensiones de la caja por
* parámetro (altura, anchura y profundidad de tipo double).
* La clase debe tener un método que devuelva el valor del volumen.
Crea un objeto de la clase e imprime el volumen correspondiente en la función main(). */

public class Ejercicio {

	public static void main(String[] args) {
		Caja miCaja=new Caja(19,7.4,12.3);
		Caja miCajaSinParametros=new Caja();
		System.out.println("EL volumen de la caja es de:"+miCaja.getVolumenCaja());
		System.out.println("EL volumen de la caja sin parametros es de:"+miCajaSinParametros.getVolumenCaja());
		}	
	}
