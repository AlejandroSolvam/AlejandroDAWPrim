/*  Exercici 1. Realitza un programa que cree un vector de 50 posicions carregat amb valors
aleatoris. Els valors aleatoris hauran d'estar entre l'1 i el 100. Una vegada carregat el vector
haurà d'ordenar-lo i mostrar-los ordenat per pantalla.
Nota: Observa per a generar un número aleatori s'utilitza el mètode random de la classe Math el qual genera un número aleatori
(double) entre 0.0 i 1.0. Si aquest es multiplica per LIMITE que és el rang de números a generar i se li suma 1, els números generats
estaran sempre entre 1 i LIMITE.
Nota2: Utilitza el següent codi:
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1{

final static int POS = 50;
final static int LIMITE = 100;
private static int[] lista=new int [POS];


public static int getaleatorio(){
    int numRandom;
    numRandom=(int) (Math.random()*LIMITE)+1;
    return numRandom;
}

public static void ordena(int lista[]){
    Arrays.sort(lista);

}

public static void muestra(){
       for (int i : lista) {
         System.out.println(i);
    }
}

public static void main(String[] args) {

 for (int i = 0; i < POS; i++) {
            lista[i] = getaleatorio();
        }

        System.out.println("Valores generados en cada posición:");

        for (int i : lista) {
            System.out.println(i);
        }

        ordena(lista);

        System.out.println("Valores generados ordenados:");

        muestra();
}

}