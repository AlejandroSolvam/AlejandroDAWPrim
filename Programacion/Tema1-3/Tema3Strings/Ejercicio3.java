/* Si tenim la cadena "Hola amics espere que estiguen bé" té 5 espais llavors que
tal si comptem quants espais existeixen i li sumim un, aqueixa podria ser
una solució correcta, però per a altres operacions mes complexes s'aconsella addicionar o
concatenar un espai mes al final de la cadena tenint així
"Hola amics espere que estiguen bé "
llavors una vegada concatenat comptarem els espais i seran 6, que representa 6 paraules.

Exercici 1. Crea el codi java necessari perquè es realitze l'anterior problema, comptar paraules.

Eliminar la K-ésima paraula d’una cadena
Primer necessitem una nova cadena on s'ira emmagatzemant la cadena menys la
paraula a eliminar, llavors el que hem de fer és també emmagatzemar paraula per paraula
en una variable i això per a concatenar a la nova cadena però menys una (la que
hem d'eliminar) aconseguint així que estiguen en la nova cadena totes les paraules
menys una, per a això també n */
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String [] args){
    Scanner Introducir=new Scanner(System.in);
    int cantidadPalabras=0;
    String frase="Hola amics espere que estiguen bé ";
    String eliminar="";
    String fraseSinN="";
    String palabra="";
    int posicion=0;
    int primeraPosicion=0;

    System.out.println("Introduce la palabra que quieres eliminar de esta frase:");
    System.out.println(frase);
    eliminar=Introducir.nextLine();

while(posicion!=-1){
    posicion=frase.indexOf(" ", posicion+1);
    if(posicion!=-1){
         palabra=frase.substring(primeraPosicion, posicion).trim();
         System.out.println("El contenido de palabra ahora mismo es de:"+palabra);
        if(palabra.equals(eliminar)){
          fraseSinN=fraseSinN;
          primeraPosicion=posicion;  
        }else{
            fraseSinN=fraseSinN+" "+palabra;
            primeraPosicion=posicion;
        }
    }else{
        }
    }
       System.out.println(fraseSinN);
}
   }