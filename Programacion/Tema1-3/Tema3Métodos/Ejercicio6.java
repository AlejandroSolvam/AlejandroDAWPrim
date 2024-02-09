/* 4. Elabora un programa utilitzant un mètode, de tal manera que donada una lletra (v,a,g,n
o b) al mètode des del programa principal s'obtinga una impressió del color triat. (v-verd,
a- groc, g-gris, n-negre i b-blanc. Sense retornar res aquest mètode. */

import java.util.Scanner;

public class Ejercicio6{

    public static void color(char letra){
            switch(letra){
              case 'v':
              case 'V':
              System.out.println("El color es verde");
              break;
              case 'a':
              case 'A':
              System.out.println("El color es amarillo");
              break;
              case 'g':
              case 'G':
              System.out.println("El color es gris");
              break;
              case 'n':
              case 'N':
              System.out.println("negro");
              break;
              case 'b':
              case 'B':
              System.out.println("blanco");
              break;
              default:
              System.out.println("No has introducido una letra correcta de las que disponías.");
                }
            }
    public static void main(String [] args){
     char letra='a';
     Scanner Introducir= new Scanner(System.in);
     System.out.println("Introduce una letra para devolverte su correspondiente color:(que sea v,a,g,n o b)");
     letra = Introducir.next().charAt(0);
     color(letra);

    }
}