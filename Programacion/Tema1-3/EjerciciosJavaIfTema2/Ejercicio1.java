/* 1. Demana un número i indicar si es positiu o negatiu. */
import java.util.Scanner;

public class Ejercicio1{
    public static void main (String [] args){

        int primerNum;
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Introduceme un número:");
        primerNum=Lectura.nextInt();

        if(primerNum>0){
           System.out.println("El número introducido es positivo."); 
        }else{
        if(primerNum==0){
            System.out.println("El número introducido es un 0, por lo que no es ni positivo ni negativo."); 
        }else{
        if(primerNum<0){
            System.out.println("El número introducido es negativo."); 
        }else{
            System.out.println("No ha introducido un valor válido, por favor, introduzca un valor entero."); 
        }
    }
    }
}
}