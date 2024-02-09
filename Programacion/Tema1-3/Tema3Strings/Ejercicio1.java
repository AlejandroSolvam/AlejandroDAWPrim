/* Exercici amb la classe Character
Exercici. Demana 2 caràcters per pantalla i compara'ls per indicar quin es major. Després comprova si els
dos caràcters son un digit o una lletra i en cas de ser una lletra, posa-la en majúscules.*/

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String [] args){
    char caracter1='a';
    char caracter2='a';
    boolean es1dig;
    boolean es2dig;

    Scanner Introducir=new Scanner(System.in);
    System.out.println("Introduce el primer carácter");
    caracter1= Introducir.next().charAt(0);
    System.out.println("Introduce el segundo carácter");
    caracter2= Introducir.next().charAt(0);

    if(caracter1>caracter2){
       System.out.println("El primer valor es mayor que el segundo"); 
    }else{
       if(caracter2>caracter1){
        System.out.println("El segundo valor es mayor que el primero");
       }else{
        System.out.println("Los dos valores son iguales");
       } 
    }
    es1dig=Character.isDigit(caracter1);
    es2dig=Character.isDigit(caracter2);
    
    if(es1dig==true){
        System.out.println("El primer carácter introduce es un dígito.");
    }else{
        System.out.println("El primer carácter introduce es un carácter.");
        System.out.println(Character.toString(caracter1).toUpperCase());
    }

     if(es2dig==true){
        System.out.println("El segundo carácter introducido es un dígito.");
    }else{
        System.out.println("El segundo carácter introducido es un carácter.");
        System.out.println(Character.toString(caracter2).toUpperCase());
    }

   
    }
}