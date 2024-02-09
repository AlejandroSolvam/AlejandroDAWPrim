/* 4. Verificar si una cadena de text emmagatzemada en la String nif, és un NIF correcte o no.
Si ho és, es mostrarà per consola la seua part numèrica;
si no ho és es mostrarà el missatge "NIF no valid".
Es tindrà en compte el següent:
• Suposar que els NIFs tenen 8 dígits i, a continuació, una lletra (no importa que siga majúscula o
minúscula).
• dues condicions que ha de complir el NIF: tindre 9 caràcters i que l'últim siga una lletra.
Comprovat això, verificar que la resta de caràcters són dígits.
Per consola dues possibilitats:
Si NIF correcte: 16156159B és un NIF valid Part numerica del NIF= 16156159
Si NIF incorrecte: 16156159 no és un NIF valid */
import java.util.Scanner;
public class Ejercicio4{
    public static void main(String [] args){
    String DNI="";
    char letra;
    String números="";
    boolean comprobar;
    int digitos=0;
    Scanner Introducir=new Scanner(System.in);
    System.out.println("Introduce tu DNI(Con 8 números y 1 letra)");
    DNI=Introducir.nextLine();

    if(DNI.length()==9){
        letra=DNI.charAt(DNI.length()-1);
        boolean esLetra= Character.isLetter(letra);
        if(esLetra==true){
       for(int i=0;i<DNI.length();i++){
           comprobar=Character.isDigit(DNI.charAt(i));
          if(comprobar==true){
            digitos++;
          } 
       }
       if(digitos==8){
        System.out.println("El DNI "+DNI+" es válido");
       }else{
        System.out.println("El DNI "+DNI+" es incorrecto ya que alguno de los primeros 8 dígitos no es un dígito");
       }
    }else{
        System.out.println("El DNI "+DNI+" es incorrecto ya que el último valor del DNI no es una letra");
    }

    }else{
        System.out.println("El DNI "+DNI+" es incorrecto ya que ni siquiera tiene 9 carácteres de longitud");
    }

    }
}