/* Exercici 2. Realitza un programa que partint de dos arrays d'enters, mostre com a eixida les
dades d'un únic array creat amb els elements dels anteriors arrays ordenats. */

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2{

final static int POS = 50;
final static int LIMITE = 100;
private static int[] primerArray=new int [POS];
private static int[] segundoArray=new int [POS];
private static int[] unionArray=new int [100];


public static int getaleatorio(){
    int numRandom;
    numRandom=(int) (Math.random()*LIMITE)+1;
    return numRandom;
}

public static void ordena(int union[]){
    Arrays.sort(union);

}

public static void muestra(){
       for (int i : unionArray) {
         System.out.println(i);
    }
}

public static void main(String[] args) {

 for (int i = 0; i < POS; i++) {
            primerArray[i] = getaleatorio();
        }

 for (int i = 0; i < POS; i++) {
            segundoArray[i] = getaleatorio();
        }

        System.out.println("Valores generados en cada posición del primer array:");

        for (int i : primerArray) {
            System.out.println(i);
        }

        System.out.println("Valores generados en cada posición del segundo array:");
        
        for (int i : segundoArray) {
            System.out.println(i);
        }

        /* Rellenar el array */

        unionArray

        int variable=0;
        for (int i = 50; i < 100; i++) {
            unionArray[i] = segundoArray[variable];
            variable++;
        }

        /* Mostrar array sin ordenar */

        System.out.println("Valores generados sin ordenar:");

        muestra();

        /* Mostrar array ordenado */

        ordena(unionArray);

        System.out.println("Valores generados ordenados:");

        muestra();
}

}