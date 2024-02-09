package Ejercicio3;
/* 3. Realiza una clase Numero que almacene un número entero y tenga las siguientes características:
• Constructor por defecto que inicializa a 0 el número interno.
• Constructor que inicializa el número interno.
• Método anyade que permite sumarle un número el valor interno.
• Método resta que resta un número al valor interno.
• Método getValor. Devuelve el valor interno.
• Método getDoble. Devuelve el doble del valor interno.
• Método getTriple. Devuelve el triple del valor interno.
• Método getNumero. Inicializa de nuevo el valor interno. */
public class Ejercicio {

	public static void main(String[]args){
		
		Numero primerNumero=new Numero(12);
		Numero segundoNumero=new Numero();
		
		System.out.println(primerNumero.getValor());
		System.out.println(segundoNumero.getValor());
		
		primerNumero.anyade(4);
		System.out.println(primerNumero.getValor());
		
		segundoNumero.anyade(7);
		System.out.println(segundoNumero.getValor());
		
		primerNumero.resta(3);
		System.out.println(primerNumero.getValor());
		
		segundoNumero.resta(4);
		System.out.println(segundoNumero.getValor());
		
		
		System.out.println(primerNumero.getDoble());
		
		System.out.println(segundoNumero.getDoble());
	}
	
}
