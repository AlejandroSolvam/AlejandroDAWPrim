/* Exercici 2. Crea un programa que llija 10 nombres enters per teclat i els guarde en un array. Calcula i
mostra la mitjana dels números que estiguen en les posicions pareixes del array */

import java.util.Scanner;

public class Ejercicio2{

    public static double sacarMedia(double [] array){
    Scanner Introduce=new Scanner(System.in);
    double numero=0;
    int vecesDividir=0;
    double media=0;

        for(int i=0;i<array.length;i++){
            System.out.println("Introduce el valor que quieres en la posición "+i+" de tu array:");
            numero=Introduce.nextDouble();
            array[i]=numero;
                if(numero%2==0){
            media=media+numero;
            vecesDividir=vecesDividir+1;
            }
        }

        media=media/vecesDividir;

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