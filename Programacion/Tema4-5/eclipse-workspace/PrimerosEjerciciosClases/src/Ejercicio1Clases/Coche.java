package Ejercicio1Clases;

public class Coche {
	private int velocidad;
	
	public void Coche(){
		velocidad=15;
	} 
	
	public void Coche(int vel){
		velocidad=vel;
	} 
	
	public int getVelocidad(){
		 System.out.println("La velocidad normal es de "+velocidad);
		 return velocidad;
		 } 
	
	public void acelera(int mas){
		 velocidad = velocidad+mas;
		 System.out.println("La velocidad después de acelerar es de "+velocidad);
		 } 
	
	public void frena(int menos){
		 velocidad = velocidad-menos;
		 System.out.println("La velocidad después de frenar es de "+velocidad);
		 }
}
