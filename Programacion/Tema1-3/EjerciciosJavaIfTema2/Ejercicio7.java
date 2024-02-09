/* 7. Demana un número entre 0 i 9.999 i digues quantes xifres té. */

import java.util.Scanner;
public class Ejercicio7{
    public static void main(String [] args){
        int PrimerNum;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        PrimerNum=Lectura.nextInt();

        if(PrimerNum>=1000){
            System.out.println(PrimerNum + "tiene 4 cifras");
        }else{
             if(PrimerNum>=100 && PrimerNum<999){
                System.out.println(PrimerNum + "tiene 3 cifras");
            }else{
                if(PrimerNum>=10 && PrimerNum<100){
                    System.out.println(PrimerNum + "tiene 2 cifras");
            }else{
                    System.out.println(PrimerNum + "tiene 1 cifra");
            }
        }
    }
}
}