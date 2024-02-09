/* Exercici 4. Crea un programa que mostre el mes en lletres, donat un valor inicial de número 
de mes, mitjançant la sentència switch.*/ 

import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args){
        int mes;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce un número entre el 1 y el 12");
        mes=Lectura.nextInt();

    switch(mes){
     case 1:System.out.print('E');
            System.out.print('N');
            System.out.print('E');
            System.out.print('R');
            System.out.print('O');
            break;

     case 2:System.out.print('F');
            System.out.print('E');
            System.out.print('B');
            System.out.print('R');
            System.out.print('E');
            System.out.print('R');
            System.out.print('O');
            break;

    case 3: System.out.print('M');
            System.out.print('A');
            System.out.print('R');
            System.out.print('Z');
            System.out.print('O');
            break;

    case 4: System.out.print('A');
            System.out.print('B');
            System.out.print('R');
            System.out.print('I');
            System.out.print('L');
            break;

     case 5:System.out.print('M');
            System.out.print('A');
            System.out.print('Y');
            System.out.print('O');
            break;

    case 6: System.out.print('J');
            System.out.print('U');
            System.out.print('N');
            System.out.print('I');
            System.out.print('O');
            break;

    case 7: System.out.print('J');
            System.out.print('U');
            System.out.print('L');
            System.out.print('I');
            System.out.print('O');
            break;

     case 8:System.out.print('A');
            System.out.print('G');
            System.out.print('O');
            System.out.print('S');
            System.out.print('T');
            System.out.print('O');
            break;

    case 9: System.out.print('S');
            System.out.print('E');
            System.out.print('P');
            System.out.print('T');
            System.out.print('I');
            System.out.print('E');
            System.out.print('M');
            System.out.print('B');
            System.out.print('R');
            System.out.print('E');
            break;

    case 10:System.out.print('O');
            System.out.print('C');
            System.out.print('T');
            System.out.print('U');
            System.out.print('B');
            System.out.print('R');
            System.out.print('E');
            break;

    case 11:System.out.print('N');
            System.out.print('O');
            System.out.print('V');
            System.out.print('I');
            System.out.print('E');
            System.out.print('M');
            System.out.print('B');
            System.out.print('R');
            System.out.print('E');
            break;

    case 12:System.out.print('D');
            System.out.print('I');
            System.out.print('C');
            System.out.print('I');
            System.out.print('E');
            System.out.print('M');
            System.out.print('B');
            System.out.print('R');
            System.out.print('E');
      
    default:
        System.out.println("No has introducido un número entre el 1 y el 12");
    }

  }
}