/* 1. Dado un String de este formato (“Andalucia, Madrid, Comunidad Valenciana,...”) con
diferentes comunidades autónomas. Muestre todas las que empiecen por la letra indicada, ya
sea mayúsculas o minúsculas y guarde la información en un array. Utiliza al menos un método,
diferente del main para solucionarlo. */

import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[]args){
        
        Scanner Introducir=new Scanner(System.in);
        int i=0;
        int posicion=0;
        int posicionInicio=0;
        String comunidades="";
        String comunidad="";
        char letra='a';
        int tamaño=0;

        System.out.println("Introduce comunidades autónomas separadas por comas:");
        comunidades=Introducir.nextLine();

        System.out.println("Introduce la letra de las comunidades autónomas que quieres buscar:");
        letra=Introducir.next().charAt(0);

        while(posicion!=-1){
        posicion=comunidades.indexOf(",", posicion+1);        
        tamaño++;
        }
        posicion=0;

        String [] comunidadesAuto=new String[tamaño];
        

    while(posicion!=-1){
    posicion=comunidades.indexOf(",", posicion+1);
      if(posicion!=-1){
        comunidad=comunidades.substring(posicionInicio, posicion).trim();
        }else{
        comunidad=comunidades.substring(posicionInicio).trim();
        }
    posicionInicio=posicion+1;
    comunidadesAuto[i]=comunidad;
    i++;
       }

     for(int j=0;j<comunidadesAuto.length;j++){

     if(comunidadesAuto[j].charAt(0)==letra){
        System.out.println(comunidadesAuto[j]);
        }
     }   

   }
}