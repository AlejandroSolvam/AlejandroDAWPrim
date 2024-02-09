//Exercicio 1. Prova de canvis de tipus - cast
public class Ejercicio3 {
public static void main(String[] args) {
// Test de cast
//part 1 : TestTipus1
int b=10;
short c=5;
int a = b + c;
char mas = '+';
System.out.print(b);
System.out.print(mas);
System.out.print(c);
System.out.print('=');
System.out.println(a);
//part 2 : TestTipus2
int d = 65535; // canvia 1024 por 65535
short e = (short)d;
System.out.print(d + "\t");
System.out.println(e);
long g = 2048;
double f = g;
g = (long)f;
System.out.print(f + "\t");
System.out.println(g);
//part 3 : TestTipus3
long p = (long) 12345.56;
int q = p;  /* elimina (int)  Me da error ya que no estoy reconvirtiendo "p" a la misma unidad a la que quiero asignar
mi variable */
System.out.print(p + "\t");
System.out.println(q);
char t = 65535; // canvia 't' por 65535
int j = t; /* Me da error ya que se intenta reconvertir una variable tipo char en un tipo int */
short k = t; // elimina (short)
System.out.println(t);
System.out.println(j);
System.out.println(k);
float r = 12.35; //lleva la F final, DA ERROR YA QUE SE INTENTA RECONVERTIR UN DOUBLE A UN FLOAT, UN VALOR MAYOR A UNO MENOR
System.out.println(r);
// Test infinito
System.out.println(1.0/0);
//System.out.println( 1/0); //comenta aquesta línia
}
}