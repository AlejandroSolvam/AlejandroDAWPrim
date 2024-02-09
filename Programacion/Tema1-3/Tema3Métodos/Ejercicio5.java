/* 3. Elabora un programa utilitzant un mètode indicat en la classe, de tal manera que donat
el número de dia(valor entre 1 i 7, imprimisca dilluns si és 1, dimarts si és 3 i així
successivament).
El mètode s'haurà de cridar DiaDeLaSemana, al qual se li passarà una variable de tipus
sencer, que serà el valor entre un i set introduït per pantalla i no retornarà res. */

import java.util.Scanner;

    public class Ejercicio5{

        public static void DiaDeLaSemana(int numSem){
        
        if(numSem>=1 && numSem<=7){
        switch(numSem){
          case 1:
          System.out.println("Lunes");
          break;
          case 2:
          System.out.println("Martes");
          break;
          case 3:
          System.out.println("Miércoles");
          break;
          case 4:
          System.out.println("Jueves");
          break;
          case 5:
          System.out.println("Viernes");
          break;
          case 6:
          System.out.println("Sábado");
          break;
          case 7:
          System.out.println("Domingo");
          break;
          default:
          System.out.println("Como has entrado??");
            }
        }else{
        System.out.println("Has introducido un valor que no esta entre los días de la semana(1 y 7)");    
        }
    }

        public static void main(String [] args){
        int numSem=0;
        Scanner lector= new Scanner(System.in);
        System.out.println("Introduce el número del día de la semana:");
        numSem=lector.nextInt();
        DiaDeLaSemana(numSem);
        
        }
    }