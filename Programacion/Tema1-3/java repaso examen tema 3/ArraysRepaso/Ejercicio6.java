/* Exercici 2. Crear i carregar dues matrius de grandària 3x3, sumar-les i mostrar la seua suma */

import java.util.Scanner;

 public class Ejercicio6{
 public static void main(String [] args){
        Scanner Introducir=new Scanner(System.in);
        int filas=0;
        int columnas=0;
        System.out.println("Introduzca las filas que quieres que tengan tus arrays:");
        filas=Introducir.nextInt();
        System.out.println("Introduzca las columnas que quieres que tengas tus arrays:");
        columnas=Introducir.nextInt();
        int [][] array=new int [filas][columnas];
        int [][] array2=new int [filas][columnas];


        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.println("Introduzca el contenido de la fila " +i+ " columna " +j+" de la primera matriz:");
                array[i][j]=Introducir.nextInt();
                System.out.println("Introduzca el contenido de la fila " +i+ " columna " +j+" de la segunda matriz:");
                array2[i][j]=Introducir.nextInt();
            }
        }

        int suma=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                suma=array[i][j]+array2[i][j];
                System.out.println("La suma de la posicion del array fila "+i+ " columna "+j+" es de:"+suma);
            }
        }
    }
 }