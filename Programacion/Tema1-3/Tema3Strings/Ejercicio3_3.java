/* Invertir les paraules d’una cadena
El truc per a invertir una cadena és en la concatenació, la concatenació per esquerra, és a dir si nosaltres
tenim la cadena "abc" i fem la següent operació 'x' + "abc", tenim "xabc" i així si extraiem caràcter per
caràcter i ho concatenem per esquerra ja tenim la cadena invertida, el mateix cal fer però paraula per
paraula, detectant paraules i emmagatzemant-les inversament i després recien concatenar la paraula a la
nova cadena, el codi Java és el següent.
Exercici 3. Crea el codi java necessari perquè es realitze l'anterior problema, invertir paraules. */
import java.util.Scanner;
public class Ejercicio3_3{
    public static void main(String[]args){
        String frase="";
        Scanner Introducir=new Scanner(System.in);

        System.out.println("Introduce la frase que quieres invertir:");
        frase=Introducir.nextLine();

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
        System.out.println(fraseInversa);
    }
}