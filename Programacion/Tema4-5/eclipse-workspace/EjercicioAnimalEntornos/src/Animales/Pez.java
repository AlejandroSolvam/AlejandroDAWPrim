package Animales;

public class Pez extends Animal {
	
	private int sizeInFt;
	private boolean canEat;
	
	Pez(){
		this.sizeInFt=4;
		this.canEat=false;
	}
	
	Pez(int tam, boolean com){
		this.sizeInFt=tam;
		this.canEat=com;
	}
	
	private boolean swim(){
/* Hacer un if en el que se compruebe si puede nadar el pez */
		return true;
	}
}
