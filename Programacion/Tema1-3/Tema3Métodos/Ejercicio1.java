/* Exercici 1:
Escriu un programa en Java que posseïsca 2 mètodes, el primer d'ells permet determinar si un número és
parell. El segon mètode calcula el nombre imparell segons la seua posició. (Exemple l'usuari ingressa la
posició 1 el mètode ha de retornar 1, posició 2 es retorna 3, posició 3 es retorna 5 i així successivament).
Recorda usar paràmetres d'entrada per a comunicar valors als mètodes.
Programa resolt en pseudocodi: */
import java.util.Scanner;

public class Ejercicio1{

    public static void main(String [] args){
        int num=0;
        int pos=0;
        int res=0;

    Scanner Introducir=new Scanner(System.in);
        System.out.println("Introduce un número");
        num=Introducir.nextInt();
        System.out.println("Introduce la posición para el número");
        pos=Introducir.nextInt();

        if(esPar(num)==true){
        System.out.println("El número es par");
        }else{
        System.out.println("El número es impar");    
        }

        res=obtenerImpar(pos);
        System.out.println(res);    
    }

    public static boolean esPar(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static int obtenerImpar(int pos){

       int imp;
       imp=(pos*2)-1;
       return imp; 
    }
}