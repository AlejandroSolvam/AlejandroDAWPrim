/* 2) Realitza un programa que llisca una matriu de temperatures (7 dies) d'una setmana i
mostre el següent menú per a calcular el corresponent:
• La suma total.
• La mitjana setmanal.
• La màxima
• la mínima.
Cada opció de menú es crearà a un mètode diferent. Fent que el menú aparega al mètode principal. */
import java.util.Scanner;
public class ejerciciorepaso2{

    public static double sumaTotal(double [] array){
        double suma=0;

        for(int i=0;i<array.length;i++){
            suma=suma+array[i];    
        }
    return suma;
    }

    public static double MediaTotal(double [] array){
        double media=0;

        for(int i=0;i<array.length;i++){
            media=media+array[i];    
        }
        media=media/array.length;
    return media;
    }

    public static double MaximoTotal(double [] array){
        double maximo=0;

        for(int i=0;i<array.length;i++){
            if(maximo<array[i]){
                maximo=array[i];
            }  
        }
    return maximo;
    }

    public static double MinimoTotal(double [] array){
        double minimo=100;

        for(int i=0;i<array.length;i++){
            if(minimo>array[i]){
                minimo=array[i];
            }  
        }
    return minimo;
    }

    public static void main(String [] args){

        Scanner Introducir=new Scanner(System.in);
        double [] temperatura=new double[7];
        boolean seguir=true;

        for(int i=0;i<temperatura.length;i++){
            System.out.println("Introduce la temperatura que quieres para la posicion" +i);
            temperatura[i]=Introducir.nextDouble();
        }

        while(seguir!=false){
        System.out.println("Introduce que opción quieres hacer:");
        System.out.println("0. Salir del programa:");
        System.out.println("1. La suma total de las temperaturas:");
        System.out.println("2. La media semanal:");
        System.out.println("3. La máxima temperatura:");
        System.out.println("4. La mínima temperatura:");
        int opcion=0;
        opcion=Introducir.nextInt();

        switch(opcion){
            case 0:
                seguir=false;
                break;
            case 1:
                double totalFinalSuma=0;
                totalFinalSuma=sumaTotal(temperatura);
                System.out.println("La suma total de las temperaturas es de:"+totalFinalSuma);
                break;
            case 2:
                double totalFinalMedia=0;
                totalFinalMedia=MediaTotal(temperatura);
                System.out.println("La media total de las temperaturas es de:"+totalFinalMedia);
                break;
            case 3:
                double totalFinalMaximo=0;
                totalFinalMaximo=MaximoTotal(temperatura);
                System.out.println("El máximo total de las temperaturas es de:"+totalFinalMaximo);
                break;
                case 4:
                double totalFinalMinimo=0;
                totalFinalMinimo=MinimoTotal(temperatura);
                System.out.println("El máximo total de las temperaturas es de:"+totalFinalMinimo);
                break;
        }
        }


    }
}