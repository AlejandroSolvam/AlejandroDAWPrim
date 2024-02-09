/* 1. Escriu un programa que donat un número de l'1 al 10 el retorne en anglés */

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){
        int num;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10");
        num=Lectura.nextInt();

    switch(num){
     case 1:System.out.println("One");
            break;

     case 2:System.out.println("Two");
            break;

    case 3:System.out.println("Three");
            break;

    case 4:System.out.println("Four");
            break;

     case 5:System.out.println("Five");
            break;

    case 6:System.out.println("Six");
            break;

    case 7:System.out.println("Seven");
            break;

     case 8:System.out.println("Eight");
            break;

    case 9:System.out.println("Nine");
            break;

    case 10:System.out.println("Ten");
            break;
    default:
        System.out.println("Has introducido un número que no está entre el 1 y el 10");
    }

  }
}
