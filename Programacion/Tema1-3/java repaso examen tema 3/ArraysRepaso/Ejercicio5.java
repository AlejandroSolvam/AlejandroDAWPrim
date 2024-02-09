/* Exercici 1. Realitza un programa que genere una matriu 5 x 8 i mostre els elements en forma de matriu.
Nota:
Carregar valors al array: matriz[0][0] = 1; o int[][] matriz = {{1,2},{3,4},{5,6}};
Per a obtenir el nombre de files de la matriu, podem recórrer a la propietat “length” dels arrays, de la següent manera:
int files = matriz.length;
Per al cas del nombre de columnes seria de la següent forma:
int columnes = matriz[0].length; */

 import java.util.Scanner;

 public class Ejercicio5{
 public static void main(String [] args){
        Scanner Introducir=new Scanner(System.in);
        int filas=0;
        int columnas=0;
        System.out.println("Introduzca las filas que quieres que tenga tu array:");
        filas=Introducir.nextInt();
        System.out.println("Introduzca las columnas que quieres que tenga tu array:");
        columnas=Introducir.nextInt();
        int [][] array=new int [filas][columnas];

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.println("Introduzca el contenido de la fila " +i+ " columna " +j+":");
                array[i][j]=Introducir.nextInt();
            }
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.println(array[i][j]);
            }
        }
    }
 }