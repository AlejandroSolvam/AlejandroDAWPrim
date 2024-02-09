/* 5. Demana dos números i mostrar’ls ordenats de major a menor. */

import java.util.Scanner;
public class Ejercicio5{
    public static void main(String [] args){
        int PrimerNum;
        int SegundoNum;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        PrimerNum=Lectura.nextInt();

        System.out.println("Introduce el segundo número:");
        SegundoNum=Lectura.nextInt();
        if(PrimerNum>SegundoNum){
            System.out.println(PrimerNum+ " - " +SegundoNum);
        }else{
             if(SegundoNum>PrimerNum){
            System.out.println(SegundoNum+ " - " +PrimerNum);
            }else{
                System.out.println("Los dos números son iguales");
            }
        }
    }
}