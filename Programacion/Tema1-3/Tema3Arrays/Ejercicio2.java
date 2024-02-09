/*Exercici 2. Crea un programa que llija 10 nombres enters per teclat i els guarde en un array. Calcula i
mostra la mitjana dels números que estiguen en les posicions pareixes del array.*/

import java.util.Scanner;
public class Ejercicio2{
     		public static void main(String[] args) {

                Scanner Introducir=new Scanner(System.in);
     			int[] Notas = new int[10];
                float suma=0;
                int contador=0;
                float media=0;

                for(int i=0;i<Notas.length;i++){
                    System.out.println("Introduce el valor para la posicion "+i+":");
                    Notas[i] = Introducir.nextInt();
                    System.out.println(Notas[i]);
                }

                for(int i=0;i<Notas.length;i++){
                    if(i%2==0){
                    suma=suma+Notas[i];
                    contador++;  
                    }
                }
                
                media=suma/contador;
                System.out.println("El resultado de la media de los numeros pares es de:"+media);

            }
        }
