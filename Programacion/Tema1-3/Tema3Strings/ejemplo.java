import java.util.Scanner;
public class ejemplo{
	public static void main (String [] args){
	Scanner Leer= new Scanner (System.in);
	System.out.println("Introduzca una frase");
	String frase=Leer.nextLine(); 
	System.out.println("Que palabra quieres eliminar de tu frase");
	String eliminar=Leer.nextLine();
	
	String resultado=EliminarPalabras(frase,eliminar);
	System.out.println(resultado);
	
	}
	
	static String EliminarPalabras (String frase, String eliminar){
		int posicion=frase.indexOf(eliminar);
		int posicion2=eliminar.length();
		int posicion3=frase.length();
		String subfrase="";
		String subfrase2="";
		String frase_nueva="";
		
		
			if(frase.startsWith(eliminar)==true){ 
				frase_nueva=frase.substring(posicion2+1);}
					else{ if (frase.endsWith(eliminar)==true){
						frase_nueva=frase.substring(0,posicion-1);}
						else{
							subfrase=frase.substring(0,posicion-1);
							subfrase2=frase.substring(posicion+posicion2);
							frase_nueva=subfrase+subfrase2;}}
		
		return frase_nueva;
		}
	}