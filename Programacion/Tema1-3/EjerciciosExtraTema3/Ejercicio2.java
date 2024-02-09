/* 2) Realitza un programa que llisca una matriu de temperatures (7 dies) d'una setmana i
mostre el següent menú per a calcular el corresponent:
• La suma total.
• La mitjana setmanal.
• La màxima
• la mínima.
Cada opció de menú es crearà a un mètode diferent. Fent que el menú aparega al mètode principal. */

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2{

    public static double sumarTemperaturas(double Array[]){
        double suma=0;
        for(int i=0;i<Array.length;i++){
            suma=suma+Array[i];
        }
        return suma;
    }

    public static double mediaSemanal(double Array[]){
        double media=0;
        double suma=0;
        for(int i=0;i<Array.length;i++){
            suma=suma+Array[i];
        }

        media=(suma/7);
            return media;
    }

    public static double diaMáximo(double Array[]){
        double maximo=0;
        double suma=0;
        for(int i=0;i<Array.length;i++){
            if(Array[i]>maximo){

            maximo=Array[i];
            
            }
        }

        return maximo;
    }

    public static double diaMínimo(double Array[]){
        double minimo=10000;
        double suma=0;
        for(int i=0;i<Array.length;i++){
            if(Array[i]<minimo){

            minimo=Array[i];
            
            }
        }

        return minimo;
    }

    public static void main(String[] args){
        boolean seguir=true;
        Scanner Introducir=new Scanner(System.in);
        double[] temperatura=new double[7];

        for(int i=0;i<temperatura.length;i++){
            System.out.println("Introduce la temperatura de día "+(i+1));
            temperatura[i]=Introducir.nextDouble();
        }

    while(seguir==true){
        System.out.println("Introduce cual de las opciones quieres realizar:");
        System.out.println("0. Salir del programa");
        System.out.println("1. Suma total de la temperatura");
        System.out.println("2. Media semanal de temperatura");
        System.out.println("3. Temperatura máxima");
        System.out.println("4. Temperatura mínima");
        
        int opcion;
        opcion=Introducir.nextInt();

        switch(opcion){
            case 0:
                seguir=false;
                break;
            case 1:
                double sumar=sumarTemperaturas(temperatura);
                System.out.println("El total de la suma de todos los días es de "+sumar);
                break;
            case 2:
                double media=mediaSemanal(temperatura);
                System.out.println("El total de la media de los 7 días es de "+media);
                break;
            case 3:
                double maximo=diaMáximo(temperatura);
                System.out.println("El número de temperatura máximo de los 7 días es de: "+maximo);
                break;
            case 4:
                double minimo=diaMínimo(temperatura);
                System.out.println("El número de temperatura mínimo de los 7 días es de: "+minimo);
                break;
            default:
                System.out.println("No has introducido una de las opciones disponibles");
                break;    
        }
        }


    }
}