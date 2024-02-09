/* 1. Codifica un mètode denominat imprimepares que imprimisca els nombres parells que
existeixen entre 2 números donats pel programa principal, aquests números hauran de ser
menors de 1000 i el programa no retornarà res al programa principal. */

import java.util.Scanner;
    public class Ejercicio3{
        static int num1=0;
        static int num2=0;

    public static void imprimePares(int num1,int num2){
      if(num1>=0 && num1<=1000 && num2>=0 && num2<=1000 && num1<num2){
    do{
      if(num1%2==0){
        System.out.println(num1);
        num1++;
        }else{
        num1++;    
        }
        }while(num1<=num2);
     }else{
        System.out.println("No has introducido un valor entre el 1 y el 1000");
     }
    }

        public static void main(String [] args){
        Scanner Introduce=new Scanner(System.in);
        System.out.println("Introduce el primer valor(Que sea menor que el segundo que vas a introducir, y que sea mayor o igual a 0):");
        num1=Introduce.nextInt();
        System.out.println("Introduce el segundo valor(Que sea mayor que el primero que has introducido, y que sea menor o igual a 1000):");
        num2=Introduce.nextInt();

        imprimePares(num1,num2);


        }
    }