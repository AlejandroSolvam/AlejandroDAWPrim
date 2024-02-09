package Animales;

public class Pato extends Animal {
	
	public String beakColor;
	
	Pato(){
		this.beakColor="yellow";
	}
	
	Pato(String col){
		this.beakColor=col;
	}
	
	public boolean swim() {
/* Hacer un if en el que se compruebe si puede nadar el pato */
		return true;
	}
	
	public boolean quack() {
		/* Hacer un if en el que se compruebe si grazna el pato */
				return true;
			}
	
}
