//Exercici 4: Demostració dels operadors incrementals
class Ejercicio4CuartaParte {
public static void main(String[] args) {
int i,j; // Variables enteras. Podrian ser reales o char
i = 7;
System.out.println("* Operando entero: i = " + i + ";");
System.out.println(" Operador ++: j = i++; ");
j = i++;
System.out.println(" // i vale " + i + "; j vale " + j);
i = 7;
System.out.println(" i = " + i + ";");
System.out.println(" j = ++i; ");
j = ++i;
System.out.println(" // i vale " + i + "; j vale " + j);
i = 7;
System.out.println("* Operando entero: i = " + i + ";");
System.out.println(" Operador --: j = i--; ");
j = i--;
System.out.println(" // i vale " + i + "; j vale " + j);
i = 7;
System.out.println(" i = " + i + ";");
System.out.println(" j = --i; ");
j = --i;
System.out.println(" // i vale " + i + "; j vale " + j);
}
}
/*
Eixida per pantalla del programa anterior:
* Operando entero: i = 7;
Operador ++: j = i++;
// i vale 8; j vale 7
i = 7;
j = ++i;
// i vale 8; j vale 8
* Operando entero: i = 7;
Operador --: j = i--;
// i vale 6; j vale 7
i = 7;
j = --i;
// i vale 6; j vale 6
*/