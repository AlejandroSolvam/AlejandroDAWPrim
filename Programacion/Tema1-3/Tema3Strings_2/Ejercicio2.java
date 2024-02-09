/* 2. Tenim una cadena de notes amb els noms i les notes de 5 dels alumnes de classe.
El contingut de la cadena és el següent:
“Juan Carlos\n 8.5\n Andrés\n 4.9\n Pedro\n 3.8\n Juan \n 6.3”
Realitza un programa que mostre per pantalla per cada alumne el següent:
L'alumne X ha tret la nota Y.
 */
import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[]args){
        
        int posicion=0;
        String alumno="";
        String nota="";
        String frase="Juan Carlos\n 8.5\n Andrés\n 4.9\n Pedro\n 3.8\n Juan \n 6.3";
        int posicionInicio=0;

    while(posicion!=-1){
    posicion=frase.indexOf("\n", posicion+1);
      if(posicion!=-1){
        alumno=frase.substring(posicionInicio, posicion).trim();
        }else{
        alumno=frase.substring(posicionInicio).trim();
        }
posicionInicio=posicion;
posicion=frase.indexOf("\n", posicion+1);
if(posicion!=-1){
        nota=frase.substring(posicionInicio, posicion).trim();
        }else{
            nota=frase.substring(posicionInicio).trim();
        }
posicionInicio=posicion;

System.out.println("El alumno "+alumno+" ha sacado un "+nota);
       }
    }
}