//Exercici 2: Demostració dels operadors aritmetics combinats
public class Ejercicio4SegundaParte {
public static void main(String[] args) {
int i,j; // Variables enteras. Podrian ser reales
i = 7;
j = 3;
System.out.println("* Operandos enteros: i = "+ i +" ; j = "+ j);
i += j;
System.out.println(" Suma combinada: i += j " + " // i vale " + i);
i = 7;
i -= j;
System.out.println(" Resta combinada: i -= j " + " // i vale " + i);
i = 7;
i *= j;
System.out.println(" Producto combinado: i *= j " + " // i vale " + i);
i = 7;
i /= j;
System.out.println(" Division combinada: i /= j " + " // i vale " + i);
i = 7;
i %= j;
System.out.println(" Resto combinada: i %= j " + " // i vale " + i);
/*
Eixida per pantalla del programa anterior:
* Operandos enteros: i = 7 ; j = 3
Suma combinada: i += j // i vale 10
Resta combinada: i -= j // i vale 4
Producto combinado: i *= j // i vale 21
Division combinada: i /= j // i vale 2
Resto combinada: i %= j // i vale 1
*/
}
}