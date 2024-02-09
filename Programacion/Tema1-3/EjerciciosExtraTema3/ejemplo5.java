import java.util.Arrays;
import java.util.Scanner;

public class ejemplo5{

    public static int[] rellenarArray(int cantidad){

        Scanner Introduce = new Scanner(System.in);
        int[] array = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el número para la posición " + (i) + " del array:");
            array[i] = Introduce.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner Introducir = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números: ");
        int cantidadNumeros = Introducir.nextInt();
        Introducir.nextLine();

        int[] numeros = rellenarArray(cantidadNumeros);

        System.out.println("Array original: " + Arrays.toString(numeros));
        
        Arrays.sort(numeros);

        int[] numerosOrdenados = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Array ordenado: " + Arrays.toString(numerosOrdenados));
    }
}