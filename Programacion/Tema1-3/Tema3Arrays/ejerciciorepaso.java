/* 1) Crea un programa que llisca una frase i una lletra i convertisca la frase a un array de lletres.
Volem que compte el nombre de vegades que apareix cada lletra.
Utilitza mètodes:
• per a mostrar el vector.
• Per a comptar el nombre de vegades que apareix la lletra.
• Per a passar la frase al vector. */
import java.util.Scanner;
public class ejerciciorepaso{

    public static void convertirArray(char [] array, String fras){
        for(int i=0;i<array.length;i++){
            array[i]=fras.charAt(i);
        }
    }

    public static void mostrarArray(char [] array, String fras){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    public static int contarArray(char [] array, String fras, char letr){

    int letraRepetida=0;

        for(int i=0;i<array.length;i++){
            if(letr==array[i]){

                letraRepetida=letraRepetida+1;

            }
        }
        return letraRepetida;
    }

    public static void main(String[]args){
        
        Scanner Introducir=new Scanner(System.in);
        String frase="";
        char letra;
        System.out.println("Introduce una frase:");
        frase=Introducir.nextLine();
        System.out.println("Introduce la letra que quieres contar:");
        letra=Introducir.next().charAt(0);
        int repeticion=0;

        char [] arrayLetras=new char[frase.length()];

        convertirArray(arrayLetras,frase);
        mostrarArray(arrayLetras,frase);
        repeticion=contarArray(arrayLetras,frase,letra);

        System.out.println("La letra "+letra+" ha sido repetida "+repeticion+" veces");

    }
}