package Ejercicio1;
/* 1. Tenim la següent classe Coche:
class Coche {
private int velocidad;
…
}
 Afegeix a la classe Coche els següents mètodes:
Coche(). Constructor
int getVelocidad(). Aquest mètode retorna la velocitat actual.
void acelera(int mas). Aquest mètode actualitza la velocitat a més kilòmetres.
void frena(int menos). Aquest mètode actualitza la velocitat a menys kilòmetres. */
public class Coche {
private int velocidad;

Coche(){
	this.velocidad=10;
}

Coche(int newV){
	this.velocidad=newV;
}

int getVelocidad() {
	return this.velocidad;
}

void acelera(int mas) {
	this.velocidad=this.velocidad+mas;
}

void frena(int fren) {
	this.velocidad=this.velocidad-fren;
}

}
