/*Exercici 3. Realitzar un programa que llija per teclat 10 nombres reals, els guarde en un vector i a
continuació imprimisca el major parell de tots ells i la seua posició.*/

import java.util.Scanner;
public class Ejercicio3{
     		public static void main(String[] args) {

                Scanner Introducir=new Scanner(System.in);
     			String[] Notas = new String[10];
                String mayorParejo="";
                int contador=0;

                for(int i=0;i<Notas.length;i++){
                    System.out.println("Introduce la palabra para la posicion "+i+":");
                    Notas[i] = Introducir.nextLine();
                }

                for(int i=0;i<Notas.length;i++){
                    if(i%2==0){
                    mayorParejo=Notas[i];
                    contador=i;    
                    }
                }
                
                System.out.println("El nombre par más alto introducido en el array es:"+mayorParejo+" y su posición es:"+contador);

            }
        }
