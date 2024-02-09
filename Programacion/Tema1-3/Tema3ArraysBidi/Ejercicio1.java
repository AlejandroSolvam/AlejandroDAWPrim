/* Exercici 1. Realitza un programa que genere una matriu 5 x 8 i mostre els elements en forma de matriu.
Nota:
Carregar valors al array: matriz[0][0] = 1; o int[][] matriz = {{1,2},{3,4},{5,6}};
Per a obtenir el nombre de files de la matriu, podem recórrer a la propietat “length” dels arrays, de la següent manera:
int files = matriz.length;
Per al cas del nombre de columnes seria de la següent forma:
int columnes = matriz[0].length; */

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        int filas=0;
        int columnas=0;
        Scanner Introducir=new Scanner(System.in);
        System.out.println("Introduce las filas que quieres para tu array:");
        filas=Introducir.nextInt();
        System.out.println("Introduce las columnas que quieres para tu array:");
        columnas=Introducir.nextInt();

        int[][] Matriz = new int[filas][columnas];

        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[0].length;j++){

                System.out.println("Introduce el contenido de la:"+"Fila "+i+" columna "+j);
                Matriz[i][j]=Introducir.nextInt();

            }
        }

        System.out.println("Los arrays que has rellenado son los siguientes:");

        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[0].length;j++){
                System.out.println("Fila "+i+" columna "+j+"="+Matriz[i][j]);
            }
        }

    }
}
