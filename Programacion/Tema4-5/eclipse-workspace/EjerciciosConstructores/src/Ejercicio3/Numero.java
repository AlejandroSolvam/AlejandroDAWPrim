package Ejercicio3;
/* Constructor por defecto que inicializa a 0 el número interno.
• Constructor que inicializa el número interno.
• Método anyade que permite sumarle un número el valor interno.
• Método resta que resta un número al valor interno.
• Método getValor. Devuelve el valor interno.
• Método getDoble. Devuelve el doble del valor interno.
• Método getTriple. Devuelve el triple del valor interno.
• Método getNumero. Inicializa de nuevo el valor interno.*/
public class Numero {

	private int num;
	
	Numero(){
		this.num=0;
	}
	
	Numero(int number){
		this.getNumero(number);
	}
	
	private void getNumero(int nume){
		this.num=nume;
	}
	
	public void anyade(int suma){
		this.num=num+suma;
	}
	
	public void resta(int quita){
		this.num=num-quita;
	}
	
	public int getValor(){
		return this.num;
	}
	
	public int getDoble(){
		return this.num*2;
	}
	
	public int getTriple(){
		return this.num*3;
	}
}
