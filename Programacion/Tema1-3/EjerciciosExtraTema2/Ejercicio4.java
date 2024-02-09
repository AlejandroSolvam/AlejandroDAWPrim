/* 4. Elaborar un programa que convertisca un nombre enter positiu, menor a 257 a sistema
binari. */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        int numOriginal = 0;
        int division = 10;
        int residuo = 0;
        int veces = 0;

        Scanner Lectura = new Scanner(System.in);
        System.out.println("Introduce el número que quieres convertir a sistema binario (Menor a 257):");
        num = Lectura.nextInt();
        System.out.println("");
        numOriginal = num;

        while (division != 0) {
            residuo = num % 2;
            veces++;
            division = num / 2;
            num = division;
        }

        System.out.print("Representación binaria al revés: ");
        while (veces != 0) {
            num = numOriginal;
            for (int i = 0; i < veces; i++) {
                residuo = num % 2;
                num = num / 2;
            }
            System.out.print(residuo);
            veces--;
        }
        System.out.println(); 
    }
}
        

