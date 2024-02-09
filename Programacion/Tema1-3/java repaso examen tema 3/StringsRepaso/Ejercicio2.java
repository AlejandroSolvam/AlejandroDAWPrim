/* Exercici 2: Crea un programa amb un mètode que conte el número de vocals que conté una cadena.
Des de el mètode principal hauràs de demanar una paraula o frase a l'usuari i hauràs de mostrar el
nombre de vocals que conté fent ús del mètode anterior.
Exemple:
Introduïsca una paraula o frase:
> “La pluja a Sevilla és una meravella”
La paraula o frase conté 15 vocals. */

import java.util.Scanner;

public class Ejercicio2{

    public static int numeroVocales(String fras){
        
        int numeroVoc=0;

        for(int i=0;i<fras.length();i++){
            if(fras.charAt(i)=='a' || fras.charAt(i)=='e' || fras.charAt(i)=='i' || fras.charAt(i)=='o' || fras.charAt(i)=='u'){
                numeroVoc=numeroVoc+1;
            }

            if(fras.charAt(i)=='A' || fras.charAt(i)=='E' || fras.charAt(i)=='I' || fras.charAt(i)=='O' || fras.charAt(i)=='U'){
                numeroVoc=numeroVoc+1;
            }
        }   

        return numeroVoc;
    }

    public static void main(String[] args){
        Scanner Introducir=new Scanner(System.in);
        String frase="";
        int vocales=0;
        System.out.println("Introduce una frase:");
        frase=Introducir.nextLine();

        vocales=numeroVocales(frase);

        System.out.println("La frase que has pasado por método tendrá "+vocales+ " vocales");
    }
}