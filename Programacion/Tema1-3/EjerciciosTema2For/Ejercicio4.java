/* Exercici 4. Realitza un programa que mostre per pantalla els 5 primers nombres parells. */

import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args){
        int numParejo=0;
        int operacion;

    for(int i=1;numParejo!=5;i++){    //preguntar porque si pongo como condición numParejo==5 no se cumple.

    operacion=i%2;

    if(operacion==0){
        System.out.println(i);
        numParejo++;
    }

}

    }
}