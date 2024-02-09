/* 2. Escriure un programa que demane una contrasenya, de tipus sencer i permeta tres
intents. Si l'usuari dóna la contrasenya correcta respon "Enhorabona!", si
no, el programa respondrà per als dos intents més “Intenta de nou”. En
cas contrari el programa escriu "El sent, contrasenya equivocada" i es tanca
immediatament.
 */


import java.util.Scanner;

public class Ejercicio2{
    public static void main(String [] args){
        int num;
        int intentos=2;
        int terminar=0;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce una contraseña con números enteros:");
        num=Lectura.nextInt();
        int contraseña=0;

        for (int i = 1; terminar != 1; i++) {
            System.out.println("Introduce la contraseña:");
            contraseña = Lectura.nextInt();

            if (contraseña == num) {
                System.out.println("Enhorabuena! Has acertado la contraseña con " + (intentos + 1) + " intentos!!!");
                terminar = 1;
            } else {
                intentos--;
                if (intentos >= 0) {
                    System.out.println("Contraseña incorrecta.");
                    System.out.println("Te quedan " + (intentos + 1) + " intentos.");
                } else {
                    System.out.println("Se han acabado los intentos, lo siento.");
                    terminar = 1;
                }
            }
        }
    }
}
