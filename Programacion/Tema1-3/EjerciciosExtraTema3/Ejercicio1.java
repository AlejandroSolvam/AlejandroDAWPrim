/* Crea un programa que lea una frase y una letra y convierta la frase a un array de letras.
Queremos el número de veces que aparece una letra.
Utiliza métodos:
-para mostrar el vector
-para contar el numero de veces que aparece cada letra
-para pasar la frase al vector */

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1{

    public static void mostrarVector(char Array[]){
    
    System.out.println("Las letras por cada posición del array son las siguientes:");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]);    
        }
    }

    

    public static int contarLetrasMétodo(char Array[], char letra){
        int contar=0;
        for(int i=0;i<Array.length;i++){
           if(letra==Array[i]){
            contar++;    
            }
        }
        return contar;
    }

    public static char[] transformarFrase(String frasePasada, char Array[]){

        for(int i=0;i<frasePasada.length();i++){
            Array[i]=frasePasada.charAt(i);    
        }
        return Array;
    }

    

    public static void main(String[] args){
        String frase="";
        char letra;
        int cantidad=0;

        Scanner Introducir=new Scanner(System.in);
        System.out.println("Introduce la frase que quieres guardar en letras");
        frase=Introducir.nextLine();

        System.out.println("Introduce la letra");
        letra=Introducir.next().charAt(0);

        char [] contarLetras =new char [frase.length()];

        contarLetras=transformarFrase(frase,contarLetras);
        mostrarVector(contarLetras);
        cantidad=contarLetrasMétodo(contarLetras,letra);
        System.out.println("");
        System.out.println("Se han introducido "+cantidad+" letras "+ "que sean una "+letra);


        
    }
}