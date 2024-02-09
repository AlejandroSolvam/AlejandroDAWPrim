package Animales;

public class Animal {
	public int age;
	public String gender;
	
	Animal(){
		this.age=0;
		this.gender="NoSeSabe";
	}
	
	Animal(int newE, String newG){
		this.age=0;
		this.gender=newG;
	}
	
	public boolean isMammal(){
		/* Comprueba si el animal si es mamífero */
		return false;
	}
	
	public boolean mate(){
		/* Comprueba si tiene compañero */
		return false;
	}
}
