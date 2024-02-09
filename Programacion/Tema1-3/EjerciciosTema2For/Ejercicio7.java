/* Exercici 7. Escriu un programa que calcule el quadrat i el cub dels enters des del 0 al 10.
Usa el tab juntament amb el print per a traure la següent taula.
Ajuda't de la llibreria Math i de la seua funció Math.pow(value, power): */

import java.lang.Math;

public class Ejercicio7{
    public static void main(String [] args){
        int cuadrado;
        int cubo;
        for(int i=0;i<=10;i++){
            cuadrado=(int) Math.pow(i,2);
            cubo=(int) Math.pow(i,3);
            System.out.println(i+"    "+cuadrado+"    "+cubo);

        }
    }
}