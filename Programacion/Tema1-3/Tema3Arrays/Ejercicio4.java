/* Exercici 4. Realitza un programa que mostre per pantalla els 4 primers arguments presos des de la línia de
comandos. */

import java.util.Scanner;
public class Ejercicio4{
     		public static void main(String[] args) {

            for(int i=0;i<args.length;i++){
                System.out.println(args[i]);
            }

        }
    }