package Ejercicio5;

/* 5. Crea la clase rebajas.
Atributo de la clase: descuento.
Crea dos constructores:
Uno no toma parámetros pero inicializa la variable descuento a 30, mientras que el segundo
constructores tendrá como parámetros el descuento.
Realiza los métodos get y set para el descuento. */

public class Rebajas {
	
	private double descuento;
	
	Rebajas(){
		this.descuento=30;
	}
	
	Rebajas(double desc){
		this.setDescuento(desc);
	}
	
	double getDescuento(){
		return this.descuento;
	}
	
	void setDescuento(double descuen){
		this.descuento=descuen;
	}
}
