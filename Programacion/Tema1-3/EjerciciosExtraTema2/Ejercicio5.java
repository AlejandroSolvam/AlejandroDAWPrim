/* 5. Deixa indroduir els valors dels costats d'un triangle. Detecta i mostra un missatge
corresponent al seu tipus (EQUILÀTER, ISÒSCELES, O ESCALÉ) */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double angulo1=0;
        double angulo2=0;
        double angulo3=0;

        Scanner Lectura = new Scanner(System.in);
        System.out.println("Introduce el valor que le quieres dar a este ángulo del triángulo:");
        angulo1 = Lectura.nextInt();
        System.out.println("");
        System.out.println("Introduce el valor que le quieres dar a este segundo ángulo del triángulo:");
        angulo2 = Lectura.nextInt();
        System.out.println("");
        System.out.println("Introduce el valor que le quieres dar a este tercer ángulo del triángulo:");
        angulo3 = Lectura.nextInt();
        System.out.println("");

        if(angulo1==angulo2 && angulo2==angulo3 && angulo1==angulo3){
            System.out.println("Tu triángulo es equilátero:");
        }else{
           if(angulo1==angulo2 || angulo2==angulo3 || angulo1==angulo3){
            System.out.println("Tu triángulo es isósceles:"); 
        }else{
             System.out.println("Tu triángulo es escaleno:");
            }
        }
    }
}