/* Eliminar la K-ésima paraula d’una cadena
Primer necessitem una nova cadena on s'ira emmagatzemant la cadena menys la
paraula a eliminar, llavors el que hem de fer és també emmagatzemar paraula per paraula
en una variable i això per a concatenar a la nova cadena però menys una (la que
hem d'eliminar) aconseguint així que estiguen en la nova cadena totes les paraules
menys una, per a això també necessitem comptar cada vegada que trobem una paraula,
el codi Java és el següent.
Exercici 2. Crea el codi java necessari perquè es realitze l'anterior problema, Eliminar paraules.
 */

import java.util.Scanner;
public class Ejercicio3_2{
    public static void main(String[]args){
        String frase="";
        String eliminar="";
        Scanner Introducir=new Scanner(System.in);

        System.out.println("Introduce la frase que quieres introducir:");
        frase=Introducir.nextLine();

        System.out.println("Introduce la palabra de la frase que quieres eliminar:");
        eliminar=Introducir.nextLine();

        String fraseNueva="";
        int posicion=frase.indexOf(eliminar);
        int posicion1=eliminar.length();
        int posicion2=frase.length();
        String subfrase1="";
        String subfrase2="";

        if(frase.startsWith(eliminar)==true){
            fraseNueva=frase.substring(posicion1+1);
        }else{
            if(frase.endsWith(eliminar)==true){
            fraseNueva=frase.substring(0,posicion-1).trim();    
            }else{
            subfrase1=frase.substring(0,posicion-1);
			subfrase2=frase.substring(posicion+posicion1);
			fraseNueva=subfrase1+subfrase2;    
            }
        }
        System.out.println(fraseNueva);

        /* ESTO VA MAL 
        if(frase.startsWith(eliminar)==true){
            fraseNueva=frase.substring(posicion2+1);
        }else{
            if(frase.endsWith(eliminar)==true){
            fraseNueva=frase.substring(0,posicion-1).trim();    
            }else{
            subfrase1=frase.substring(0,posicion-1).trim();
            subfrase2=frase.substring(posicion,posicion1).trim();
            fraseNueva=subfrase1+" "+subfrase2;    
            }
        }
        System.out.println(fraseNueva);
 */
    }
}