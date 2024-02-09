/* Exercici 1: Crea una aplicació que continga un mètode que reba com a paràmetre una cadena de text
amb una frase i aquesta funció haurà de retornar aquesta cadena però invertint la primera i l'última
paraula.
Des de el mètode principal hauràs de demanar a l'usuari que introduïsca una frase i li mostraràs
aquesta frase amb la primera i última paraula intercanviada.
Exemple:
Introduïsca una frase:
> El cel té núvols negres
Resultat: negres cel té núvols El */

import java.util.Scanner;

public class Ejercicio1{

    public static String devolverInvertir(String fras){
        
        int posicion=0;
        int posicion2=fras.length();
        int variable=0;
        String fraseVacia="";
        String palabraInicio="";
        String palabraFinal="";

        posicion=fras.indexOf(" ",posicion);
        posicion2=fras.lastIndexOf(" ",posicion2);
        fraseVacia=fras.substring(posicion,posicion2).trim();

        palabraFinal=fras.substring(0,posicion).trim();
        palabraInicio=fras.substring(posicion2,fras.length()).trim();

        fraseVacia=palabraInicio+" "+fraseVacia+" "+palabraFinal;       

        return fraseVacia;
    }

    public static void main(String[] args){
        Scanner Introducir=new Scanner(System.in);
        String frase="";
        System.out.println("Introduce una frase:");
        frase=Introducir.nextLine();

        frase=devolverInvertir(frase);

        System.out.println(frase);


    }
}