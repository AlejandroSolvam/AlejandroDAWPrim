/* 3. Fes un programa que demane introduir una cadena de caràcters per teclat i visualitze per pantalla el
nombre de caràcters a i A que conté aquesta cadena. A continuació, es mostrarà de nou la cadena
introduïda substituint aquestes a’s per i’s. */
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner Introducir=new Scanner(System.in);
        String cadena="";
        int mayusculas=0;
        int minusculas=0;

        System.out.println("Introduce una frase:");
        cadena=Introducir.nextLine();

        for(int i=0;i<cadena.length();i++){
           if(cadena.charAt(i)=='A'){
                mayusculas=mayusculas+1;
           }

           if(cadena.charAt(i)=='a'){
                minusculas=minusculas+1;
           } 
        }

        System.out.println("Nuestra frase tiene "+mayusculas+ " A mayúsculas y " +minusculas+ " a minúsculas.");
        cadena=cadena.replace('a','i');
        cadena=cadena.replace('A','I');
        System.out.println(cadena);




    }
}