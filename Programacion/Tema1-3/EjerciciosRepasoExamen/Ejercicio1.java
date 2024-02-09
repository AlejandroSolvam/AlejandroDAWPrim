/* Exercici 1. Fes un programa para posar notes:
Indica una la nota numèrica i obté la nota amb text: suspés, aprovat, bé, notable, excel·lent. */

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String []args){
    int nota=0;
    Scanner Introducir=new Scanner(System.in);
    System.out.println("Introduce la nota de tu examen:");
    nota=Introducir.nextInt();

    switch(nota){
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
        System.out.println("Has suspendido:");
            break;
    case 5:
        System.out.println("Has aprobado:");
            break;
    case 6:
        System.out.println("Has sacado un bien:");
            break;
    case 7:
    case 8:
        System.out.println("Has sacado un notable:");
            break;
    case 9:
    case 10:
        System.out.println("Has sacado un excelente:");
            break;
    default:
    System.out.println("No has introducido una nota válida");
    }
    }
}