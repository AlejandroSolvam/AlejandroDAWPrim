/* 9. Demana una nota de 0 a 10 i mostrar-la de la forma: Insuficient, Suficient, Bé, ... */

import java.util.Scanner;
public class Ejercicio9{
    public static void main(String [] args){
        int PrimerNum;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        PrimerNum=Lectura.nextInt();

        if(PrimerNum>=9 && PrimerNum<=10){
            System.out.println("Has sacado un sobresaliente.");
        }else{
             if(PrimerNum>=7 && PrimerNum<=8){
                System.out.println("Has sacado un notable.");
            }else{
                if(PrimerNum==6){
                    System.out.println("Has sacado un bien.");
            }else{
                 if(PrimerNum==5){
                    System.out.println("Has sacado un suficiente.");
            }else{
                System.out.println("Has suspendido.");
            }
        }
    }
}
}
}