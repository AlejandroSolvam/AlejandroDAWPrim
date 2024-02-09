/* Exercici 2. Crear i carregar dues matrius de grandària 3x3, sumar-les i mostrar la seua suma */

import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        int suma=0;
        Scanner Introducir=new Scanner(System.in);

        int[][] Matriz = new int[3][3];
        int[][] Matriz2 = new int[3][3];

        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[0].length;j++){

                System.out.println("Introduce el contenido de la:"+"Fila "+i+" columna "+j+" del primer array");
                Matriz[i][j]=Introducir.nextInt();

                System.out.println("Introduce el contenido de la:"+"Fila "+i+" columna "+j+" del segundo array");
                Matriz2[i][j]=Introducir.nextInt();

            }
        }

        System.out.println("Los arrays que has rellenado son los siguientes:");

        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[0].length;j++){

                suma=Matriz[i][j]+Matriz2[i][j];
                System.out.println("La suma de "+"la fila "+i+" columna "+j+" es = "+suma);

            }
        }

    }
}
