package Ejercicio2;
/* 3. Realiza una clase Numero que almacene un número entero y tenga las siguientes características:
• Constructor por defecto que inicializa a 0 el número interno.
• Constructor que inicializa el número interno.
• Método anyade que permite sumarle un número el valor interno.
• Método resta que resta un número al valor interno.
• Método getValor. Devuelve el valor interno.
• Método getDoble. Devuelve el doble del valor interno.
• Método getTriple. Devuelve el triple del valor interno.
• Método getNumero. Inicializa de nuevo el valor interno. */
public class Numero {
	private int numeroEntero;
	
	Numero(){
		this.numeroEntero=0;
	}
	
	Numero(int newN){
		this.setNumero(newN);
	}
	
	public void anyade(int sum){
		this.numeroEntero=this.numeroEntero+sum;
	}
	
	public void resta(int res){
		this.numeroEntero=this.numeroEntero-res;
	}
	
	public int getValor(){
		return this.numeroEntero;
	}
	
	public int getDoble(){
		return this.numeroEntero*this.numeroEntero;
	}
	
	public int getTriple(){
		return this.numeroEntero*this.numeroEntero*this.numeroEntero;
	}
	
	public void setNumero(int num){
		this.numeroEntero=num;
	}

}
