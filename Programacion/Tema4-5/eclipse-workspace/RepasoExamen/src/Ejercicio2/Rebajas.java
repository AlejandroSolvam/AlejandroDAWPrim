package Ejercicio2;
/* 5. Crea la clase rebajas.
Atributo de la clase: descuento.
Crea dos constructores:
Uno no toma parámetros pero inicializa la variable descuento a 30, mientras que el segundo
constructores tendrá como parámetros el descuento.
Realiza los métodos get y set para el descuento. */

public class Rebajas {

	private int descuento;
	
	Rebajas(){
		this.descuento=30;
	}
	
	Rebajas(int desc){
		this.descuento=desc;
	}
	
	public int getDescuento(){
		return this.descuento;
	}
	
	public void setDescuento(int newD){
		this.descuento=newD;
	}
	
}
