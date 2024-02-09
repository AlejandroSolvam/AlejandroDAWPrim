/* Exercici 3. Realitzar un programa que llija per teclat 10 nombres reals, els guarde en un vector i a
continuació imprimisca el major parell de tots ells i la seua posició. */

import java.util.Scanner;

public class Ejercicio3{

    public static void mostrarMayorPar(double [] array){
    Scanner Introduce=new Scanner(System.in);
    double numero=0;
    double mayorPar=0;
    int posicion=0;

        for(int i=0;i<array.length;i++){
            System.out.println("Introduce el valor que quieres en la posición "+i+" de tu array:");
            numero=Introduce.nextDouble();
            array[i]=numero;
                if(numero%2==0){
                    if(mayorPar<numero){
                        mayorPar=numero;
                        posicion=i;
                    }
            }
        }
            System.out.println("El mayor número par es "+mayorPar+" y se encuentra en la posición "+posicion+" de nuestro array.");
        
    }

    public static void main(String [] args){
        Scanner Introducir=new Scanner(System.in);
        int totalNumeros=0;
        System.out.println("Introduzca cuantos numeros va a querer que ocupe su array:");
        totalNumeros=Introducir.nextInt();
        double [] mayor=new double [totalNumeros];

        mostrarMayorPar(mayor);
    }
}