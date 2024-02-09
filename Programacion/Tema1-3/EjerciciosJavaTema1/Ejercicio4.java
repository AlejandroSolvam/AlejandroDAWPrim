//Exercici 1: Demostració dels operadors aritmetics basics
public class Ejercicio4 {
public static void main(String[] args) {
int i,j;
double a,b;
i = 7;
j = 3;
System.out.println("* Operandos enteros: i = " + i + " ; j = " + j);
System.out.println(" Operador suma: i + j = " + (i+j));
System.out.println(" Operador resta: i - j = " + (i-j));
System.out.println(" Operador producto: i * j = " + (i*j));
System.out.println(" Operador division: i / j = " + (i/j));
System.out.println(" Operador resto: i % j = " + (i%j));
a = 12.5;
b = 4.3;
System.out.println("* Operandos reales: a = " + a + " ; b = " + b);
System.out.println(" Operador suma: a + b = " + (a+b));
System.out.println(" Operador resta: a - b = " + (a-b));
System.out.println(" Operador producto: a * b = " + (a*b));
System.out.println(" Operador division: a / b = " + (a/b));
System.out.println(" Operador resto: a % b = " + (a%b));
/*
Eixida per pantalla del programa anterior:
* Operandos enteros: i = 7 ; j = 3
Operador suma: i + j = 10
Operador resta: i - j = 4
Operador producto: i * j = 21
Operador division: i / j = 2
Operador resto: i % j = 1
* Operandos reales: a = 12.5 ; b = 4.3
Operador suma: a + b = 16.8
Operador resta: a - b = 8.2
Operador producto: a * b = 53.75
Operador division: a / b = 2.906976744186047
Operador resto: a % b = 3.9000000000000004
*/
}
}