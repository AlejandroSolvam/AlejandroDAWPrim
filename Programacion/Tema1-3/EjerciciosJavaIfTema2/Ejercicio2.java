/* 2. Demana dos números i digues si un es múltiple del altre. */
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String [] args){
        int PrimerNum;
        int SegundoNum;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        PrimerNum=Lectura.nextInt();

        System.out.println("Introduce el segundo número:");
        SegundoNum=Lectura.nextInt();
        if(PrimerNum>SegundoNum){
        if(PrimerNum%SegundoNum==0){
        System.out.println("El primer número es divisible con el segundo");
    }else{
        System.out.println("Los números no son divisibles");

    }
}else{
    System.out.println("Para que el programa no de error haz que el primer numero sea mayor al segundo");
}
    }

}