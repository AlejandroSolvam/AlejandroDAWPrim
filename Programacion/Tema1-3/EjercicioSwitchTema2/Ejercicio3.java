/* Exercici 3. El algoritme per a calcular la lletra del NIF es el següent:
1. Calcula el resto de dividir el número de DNI per 23
2. La letra del NIF corresponent amb la següent taula:
Si el resto es: La letra es:
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
Crea un programa que donat un NIF et torne la lletra segons el algoritme anterior.
Utilitza una sentencia switch. */

import java.util.Scanner;

public class Ejercicio3{
    public static void main(String [] args){
        int num;
        int resto=0;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce un DNI");
        num=Lectura.nextInt();

        resto=num%23;
    switch(resto){
     case 0:System.out.println("La letra de tu NIF es T");
            break;

     case 1:System.out.println("La letra de tu NIF es R");
            break;

     case 2:System.out.println("La letra de tu NIF es W");
            break;

    case 3:System.out.println("La letra de tu NIF es A");
            break;

    case 4:System.out.println("La letra de tu NIF es G");
            break;

     case 5:System.out.println("La letra de tu NIF es M");
            break;

    case 6:System.out.println("La letra de tu NIF es Y");
            break;

    case 7:System.out.println("La letra de tu NIF es F");
            break;

     case 8:System.out.println("La letra de tu NIF es P");
            break;

    case 9:System.out.println("La letra de tu NIF es D");
            break;

    case 10:System.out.println("La letra de tu NIF es X");
            break;

     case 11:System.out.println("La letra de tu NIF es B");
            break;

     case 12:System.out.println("La letra de tu NIF es N");
            break;

    case 13:System.out.println("La letra de tu NIF es J");
            break;

    case 14:System.out.println("La letra de tu NIF es Z");
            break;

     case 15:System.out.println("La letra de tu NIF es S");
            break;

    case 16:System.out.println("La letra de tu NIF es Q");
            break;

    case 17:System.out.println("La letra de tu NIF es V");
            break;

     case 18:System.out.println("La letra de tu NIF es H");
            break;

    case 19:System.out.println("La letra de tu NIF es L");
            break;

    case 20:System.out.println("La letra de tu NIF es C");
            break;

    case 21:System.out.println("La letra de tu NIF es K");
            break;

    case 22:System.out.println("La letra de tu NIF es E");
            break;        
    default:
        System.out.println("Has introducido incorrectamente el DNI");
    }

  }
}
