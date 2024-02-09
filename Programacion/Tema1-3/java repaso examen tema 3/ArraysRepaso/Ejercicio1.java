/* Exercici 1. Calcula la mitjana d'una sèrie de números (5 en total), que es lligen per teclat. Guardant-los
prèviament en una array. */

import java.util.Scanner;

public class Ejercicio1{

    public static double sacarMedia(double [] array){
    Scanner Introduce=new Scanner(System.in);
    double numero=0;
    double media=0;

        for(int i=0;i<array.length;i++){
            System.out.println("Introduce el valor que quieres en la posición "+i+" de tu array:");
            numero=Introduce.nextDouble();
            array[i]=numero;
            media=media+numero;
        }

        media=media/array.length;

        for(int j=0;j<array.length;j++){
            System.out.println("La posicion "+j+" de el array tiene un valor de "+array[j]);
        }
        return media;
    }

    public static void main(String [] args){
        Scanner Introducir=new Scanner(System.in);
        int totalNumeros=0;
        double med=0;
        System.out.println("Introduzca cuantos numeros va a querer que ocupe su array:");
        totalNumeros=Introducir.nextInt();
        double [] media=new double [totalNumeros];

        med=sacarMedia(media);
        System.out.println("El contenido del array tiene una media de:"+med);

    }
}