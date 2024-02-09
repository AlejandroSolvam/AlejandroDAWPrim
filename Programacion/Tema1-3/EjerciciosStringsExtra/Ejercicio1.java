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
    public static void main(String[]args){
        String frase="";
        int primeraPalabra=0;
        String primera="";
        int ultimaPalabra=0;
        String ultima="";
        int posicionInicio;
        Scanner Introducir=new Scanner(System.in);

        System.out.println("Introduce la frase que quieres invertir la primera y la última palabra:");
        frase=Introducir.nextLine();

        String fraseInversa="";

        primeraPalabra=frase.indexOf(" ");
        primera=frase.substring(0, primeraPalabra).trim();

        ultimaPalabra=frase.lastIndexOf(" ");
        ultima=frase.substring(ultimaPalabra).trim();

        fraseInversa=frase.substring(primeraPalabra+1, ultimaPalabra).trim();
    
        fraseInversa=ultima+" "+fraseInversa+" "+primera;
        System.out.println(fraseInversa);

        
    }
}<