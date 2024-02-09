/* 2. Elabora un programa en el qual es codifique un mètode denominat sumarnumeros,
que obtinga el sumatori de dos números de l'1 al 15, els quals se li passaran com a
paràmetres el programa des del programa principal.Aquest mètode retornarà com a
resultat una variable de tipus sencer. Què després el programa principal traurà per
pantalla. */

import java.util.Scanner;
    public class Ejercicio4{
        static int num1=0;
        static int num2=0;

    public static int sumarNumeros(int num1,int num2){
    int fallo=0;
      if(num1>0 && num1<=15 && num2>0 && num2<=15){
        int suma=0;
        suma=num1+num2;
        return suma;
     }else{
        return fallo;
     }
    }

        public static void main(String [] args){
        Scanner Introduce=new Scanner(System.in);
        System.out.println("Introduce el primer valor:");
        num1=Introduce.nextInt();
        System.out.println("Introduce el segundo valor:");
        num2=Introduce.nextInt();
        
        int resultado=0;
        sumarNumeros(num1,num2);
        resultado=sumarNumeros(num1,num2);
        if (resultado==0 || resultado>30){
        System.out.println("El resultado da error, ya que no has introducido un valor entre el 1 y el 15");
        }else{
         System.out.println("El resultado de la suma es: "+resultado);   
        }
          }
        }
