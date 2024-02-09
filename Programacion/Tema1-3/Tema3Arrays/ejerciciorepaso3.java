/* 1. Dado un String de este formato (“Andalucia, Madrid, Comunidad Valenciana,...”) con diferentes
comunidades autónomas. Muestre todas las que empiecen por la letra indicada, ya sea mayúsculas o
minúsculas y guarde la información en un array. Utiliza al menos un método, diferente del main
para solucionarlo. */

import java.util.Scanner;
    public class ejerciciorepaso3{

        public static void rellenarArray(String [] arr, String frase, int cantidadPalabras){
            int posicion=0;
            int primeraPosicion=0;
            String comunidad="";
            int cantidad=0;

            while(posicion!=-1){
             posicion=frase.indexOf(",",posicion+1);
             if(posicion!=-1){
                comunidad=frase.substring(primeraPosicion,posicion).trim();
             }else{
                comunidad=frase.substring(primeraPosicion).trim();
             }
             primeraPosicion=posicion+1;
             comunidad=comunidad.toLowerCase();
             arr[cantidad]=comunidad;
             cantidad++;
            }
        }

        public static void mostrarComunidad(String [] arr, char letr){
            for(int i=0;i<arr.length;i++){
                if(arr[i].charAt(0)==letr){
                    System.out.println(arr[i]);
                }
            }
        }

        public static void main(String [] args){

            Scanner Introducir=new Scanner(System.in);
            String comunidades="";
            System.out.println("Introduce las comunidades que quieras (separadas por comas)");
            comunidades=Introducir.nextLine();

            System.out.println("Introduce la letra de la comunidad que vas a querer que se muestre(en minuscula):");
            char letra=Introducir.next().charAt(0);
            int cantidadPalabras=0;
            int posicion=0;

            while(posicion!=-1){
                posicion=comunidades.indexOf(",",posicion+1);
                    cantidadPalabras=cantidadPalabras+1;
            }
            

            String [] array=new String[cantidadPalabras];

            rellenarArray(array,comunidades,cantidadPalabras);

            mostrarComunidad(array, letra);


        }
    }