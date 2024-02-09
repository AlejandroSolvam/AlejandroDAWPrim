/* Exercici 2:
En el següent codi se'ns mostra el mètode main de la classe. En ell apareixen les anomenades a quatre
mètodes: AyudaSumar, AyudaRestrar, AyudaMultiplicar i AyudaDividir. Crea el codi dels mètodes perquè
realitze les operacions necessàries. */
import java.util.Scanner;
public class Ejercicio2{
static int num1, num2, resultado;
static int opcion;

    public static int ayudaSumar(){
        int suma=0;
        suma=num1+num2;
        return suma;
    }

    public static int ayudaRestar(){
        int resta=0;
        resta=num1-num2;
        return resta;
    }

    public static int ayudaMultiplicar(){
        int multiplic=0;
        multiplic=num1*num2;
        return multiplic;
    }

    public static int ayudaDividir(){
        int dividir=0;
        dividir=num1/num2;
        return dividir;
    }

    public static void main(String [] args){

        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        num1=lector.nextInt();
        System.out.println("Introduce el segundo número:");
        num2=lector.nextInt();

        do{
          System.out.println("Te puedo ayudar a: ");
          System.out.println("1. SUMAR");
          System.out.println("2. RESTAR");
          System.out.println("3. MULTIPLICAR");
          System.out.println("4. DIVIDIR");
          System.out.println("5. FIN");
          System.out.println("\n OPCIÓN: ");
          opcion=lector.nextInt();
          switch(opcion){
            case 1:
                resultado=ayudaSumar();
                System.out.println("El resultado de la suma es de "+resultado);
                break;
            case 2:
                resultado=ayudaRestar();
                System.out.println("El resultado de la resta es de "+resultado);
                break;
            case 3:
                resultado=ayudaMultiplicar();
                System.out.println("El resultado de la multiplicación es de "+resultado);
                break;
            case 4:
                resultado=ayudaDividir();
                System.out.println("El resultado de la división es de "+resultado);
            }
          }while(opcion!=5);
        }
    }