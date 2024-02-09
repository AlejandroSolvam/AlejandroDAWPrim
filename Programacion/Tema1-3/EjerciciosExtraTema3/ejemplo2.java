
import java.util.Scanner;

public class ejemplo2{

    public static void CuantoPuedoEstudiar(int numHorasEstudio) {
        int dormir=8;
        int horasEnClase=6;
        int tiempoLibre=2;
        int horasGastadas=0;
        int suma=dormir+horasEnClase+tiempoLibre+horasGastadas+numHorasEstudio;
        int horasDelDia=24;

        if(suma>horasDelDia){
            System.out.println("No vas a tener tiempo de estudiar hoy, otro día será.");
        }else{
            if(suma==horasDelDia){
            System.out.println("Vas a ir con el tiempo justo, aprovecha y empieza a estudiar ya.");
            }else{
                suma=(horasDelDia-suma);
                System.out.println("APROVECHA, te quedan "+suma+" horas para estudiar programación.");
            }
        }
    }

    public static void main(String[] args) {
        int numero1=0;
        Scanner Introducir=new Scanner(System.in);
        System.out.println("Introduce cuantas horas vas a querer estudiar hoy:");
        numero1=Introducir.nextInt();
        CuantoPuedoEstudiar(numero1);
    }
}