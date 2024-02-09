/* 1. Per als tres exercicis anteriors, comptar paraules, eliminar paraules i escriure de la inversa d'una cadena,
crea una única classe. En ella hauran d'aparéixer els exercicis anteriors, com a mètodes d'ella i en el
programa principal es demanarà per pantalla la frase i a continuació, apareixerà un menú en el qual
s'indique:
MENÚ:
• comptar paraules
• eliminar paraules
• escriure de la inversa
El resultat de qualsevol mètode es retornarà al programa principal perquè el mostre per pantalla. */

import java.util.Scanner;

public class Ejercicio1{

    public static int contarPalabras(String frase){
       int contarPal=0;
       int posicion=0;
       while(posicion!=-1){
        posicion = frase.indexOf(" ",posicion+1);
        contarPal++;
        }
       return contarPal;
        }

    public static String eliminarPalabras(String frase, String eliminar){
        String fraseNueva="";
        int posicion=frase.indexOf(eliminar);
        int posicion1=eliminar.length();
        int posicion2=frase.length();
        String subfrase1="";
        String subfrase2="";

        if(frase.startsWith(eliminar)==true){
            fraseNueva=frase.substring(posicion1+1);
        }else{
            if(frase.endsWith(eliminar)==true){
            fraseNueva=frase.substring(0,posicion-1).trim();    
            }else{
            subfrase1=frase.substring(0,posicion-1);
			subfrase2=frase.substring(posicion+posicion1);
			fraseNueva=subfrase1+subfrase2;    
            }
        }
        return fraseNueva;
        }

    public static String invertirPalabras(String frase){
        int posicion=0;
        int posicionInicio=0;
        String palabra="";
        String fraseInversa="";
        
        while(posicion!=-1){

        posicion=frase.indexOf(" ", posicion+1);
        if(posicion!=-1){
        palabra=frase.substring(posicionInicio, posicion).trim();
        }else{
            palabra=frase.substring(posicionInicio).trim();
        }
        fraseInversa=(palabra+" "+fraseInversa);

        posicionInicio=posicion;
        }
        return fraseInversa;
    }
        
    

    public static void main(String [] args){
     Scanner Introducir=new Scanner(System.in);
     boolean seguir=true;
     do{
     int opcion=0;
     String frase="";
     String eliminar="";
     String eliminarPal="";
     String invertida="";


     System.out.println("Introduce una frase.");
     frase=Introducir.nextLine();

     System.out.println("Introduce cual de las 3 opciones vas a querer realizar:");
     System.out.println("1º: Contar palabras.");
     System.out.println("2º: Eliminar palabras.");
     System.out.println("3º: Escribir frase a la inversa.");
     System.out.println("4º: Terminar programa.");
     opcion=Introducir.nextInt();

     switch(opcion){
              case 1:
              Introducir.nextLine();  
              int totalPalabras=0;
              totalPalabras=contarPalabras(frase);
              System.out.println("El total de palabras que contiene la frase son de :"+totalPalabras+" palabras");
              break;

              case 2:
              Introducir.nextLine();
              System.out.println("Introduce la palabra que quieres eliminar:");
              eliminar=Introducir.nextLine();
              eliminarPal=eliminarPalabras(frase, eliminar);
              System.out.println(eliminarPal);
              break;
              case 3:
              Introducir.nextLine();  
              invertida=invertirPalabras(frase);
              System.out.println(invertida);
              break;
              case 4:
              System.out.println("Se ha finalizado el programa.");  
              seguir=false;
              break;
              default:
              System.out.println("No has introducido una letra correcta de las que disponías.");
                }
       }while(seguir!=false);
    }
}