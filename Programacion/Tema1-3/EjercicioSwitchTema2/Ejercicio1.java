/* Exercici1. Donada la següent seqüencia de sentencies if-else transforma-les a una
seqüencia equivalent utilitzant una única sentència switch:
if (opcion==’u’)
x=x+1;
else
if (opcion==’d’)
x=x+2;
else
if (opcion==’t’)
x=x+3;
else
x=x+4; */

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){
    char letra;
    int x=0;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce una letra que sea (u-d-t)");
        letra=Lectura.next().charAt(0);

    switch(letra){
     case 'u':
        x=x+1;
        System.out.println("La variable x ahora vale:"+x);
            break;

     case 'd':
        x=x+2;
        System.out.println("La variable x ahora vale:"+x);
            break;

    case 't':
        x=x+3;
        System.out.println("La variable x ahora vale:"+x);
            break;

    default:
        x=x+4;
        System.out.println("La variable x ahora vale:"+x);
            break;
    }


    }
}