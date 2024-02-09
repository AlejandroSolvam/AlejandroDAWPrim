/* Exercici 1. Calcula la mitjana d'una sèrie de números (5 en total), que es lligen per teclat. Guardant-los
prèviament en una array. */ 	
    import java.util.Scanner;
public class Ejercicio1{
     		public static void main(String[] args) {

                Scanner Introducir=new Scanner(System.in);
     			float[] Notas = new float[5];
                float suma=0;
                int contador=0;
                float media=0;

                for(int i=0;i<Notas.length;i++){
                    System.out.println("Introduce el valor para la posicion "+i+":");
                    Notas[i] = Introducir.nextFloat();
                    suma=suma+Notas[i];
                    contador++;    
                }
                
                media=suma/contador;
                System.out.println("El resultado de la media de las 5 sumas es de:"+media);

            }
        }