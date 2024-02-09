/* 3. Demana dos números i digues quin es el major */

import java.util.Scanner;
public class Ejercicio3{
    public static void main(String [] args){
        int PrimerNum;
        int SegundoNum;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        PrimerNum=Lectura.nextInt();

        System.out.println("Introduce el segundo número:");
        SegundoNum=Lectura.nextInt();
        if(PrimerNum>SegundoNum){
        System.out.println("El primer número es mayor que el segundo");
        }else{
            if(SegundoNum>PrimerNum){
                System.out.println("El segundo número es mayor que el primero");        
            }else{
            if(PrimerNum==SegundoNum){
                 System.out.println("Los dos números son iguales.");        
            }else{
                 System.out.println("No has introducido valores válidos.");  
            }
        }
    }
    }
}