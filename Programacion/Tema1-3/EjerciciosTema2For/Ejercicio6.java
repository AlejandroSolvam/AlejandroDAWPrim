/* Exercici 6. Escriu un programa que permeta la entrada de una sèrie de N dades i ens
mostre: el nombre de dades introduïdes, la suma dels valors de les dades, la mitjana del
conjunt de dades, el màxim i el mínim. */

import java.util.Scanner;

public class Ejercicio6{
    public static void main(String [] args){
        int Num;
        int variableNum=0;
        int cantidadNumIntro=0;
        int Suma;
        int Media;
        int Máximo=-10;
        int Mínimo=1000;
        boolean continuar=true;

    for(int i=1;continuar!=false;i++){
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el número:");
        Num=Lectura.nextInt();

        Suma=variableNum+Num;
        cantidadNumIntro=cantidadNumIntro+1;
        Media=Suma/cantidadNumIntro;

        if(Num>variableNum){
            Máximo=Num;
        }else{
            Máximo=variableNum;
        }

        variableNum=Num;

        if(Num<variableNum){
            Mínimo=Num;
        }else{
            Mínimo=variableNum;
        }

        System.out.println("Valor introducido:"+Num);

        System.out.println("Deseas introducir más números?: Di 'true' si deseas continuar o 'false' si deseas terminar ya.");
        continuar=Lectura.nextBoolean();
        if(continuar==false){
            System.out.println("Suma de los datos introducidos:"+Suma);
            System.out.println("Media de los datos introducidos:"+Media);
            System.out.println("Número máximo de los datos introducidos:"+Máximo);
            System.out.println("Número mínimo de los datos introducidos:"+Mínimo);
        }
    }
        
    }
}      