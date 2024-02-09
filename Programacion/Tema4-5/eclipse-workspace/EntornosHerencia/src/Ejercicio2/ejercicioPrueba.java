package Ejercicio2;

public class ejercicioPrueba {
/* 
 Exercici de constructors de subclasses
 
Quina seria l'eixida del següent mètode?

CLASE MAIN

public static void main(String[] args){

Hijo h = new Hijo(); SE CREA EL OBJETO h QUE ES CLASE DE HIJO
System.out.println(“\nm1 devuelve:” + h.m1()); SE MUESTRA EL METODO m1, esto muestra en pantalla 1, ya que se muestra el metodo
m1 de la clase "padre", y este returna un 1.

System.out.println(“\nm2:”);
h.m2();
SE MUESTRA EL METODO m2 de hijo, ESTE METODO LLAMA AL METODO de clase "padre" y además muestra Hijo.m2, el metodo m2 de la clase "padre" llama al metodo de la clase "abuelo" m2
 y además muestra Padre.m2, y por ultimo el metodo m2 de la clase "abuelo" muestra abuelo.m2.
m1 de la clase "padre".
System.out.println(“\nm3:”);
h.m3();
SE MUESTRA EL METODO m3 de hijo, ESTE METODO LLAMA AL METODO de clase "abuelo" y además muestra Hijo.m3, el metodo m3 de la clase "abuelo" muestra abuelo.m3.
System.out.println(“\nm4:”);
h.m4();
SE MUESTRA EL METODO m4 de hijo, que es el metodo m4 heredado de la clase "PADRE", pero no es usado al pedir como parametro un int, ESTE METODO LLAMA AL METODO de clase "abuelo" y además muestra Padre.m4, el metodo m4 de la clase "abuelo" muestra abuelo.m4.
System.out.println(“\nm4:”);
}

CLASE ABUELO

public class Abuelo{
public int m1(){
return 0;
}
public void m2(){
System.out.println(“Abuelo.m2”);
}
public void m3(){
System.out.println(“Abuelo.m3”);
}
public void m4(){
System.out.println(“Abuelo.m4”);
}
}

CLASE PADRE

public class Padre extends Abuelo{
public int m1(){
return 1;
}
public void m2(){
super.m2();
System.out.println(“Padre.m2”);
}
public void m4(int i){
super.m4();
System.out.println(“Padre.m4”);
}
}

CLASE HIJO

public class Hijo extends Padre{
public int m1(){
return super.m1();
}
public void m2(){
super.m2();
System.out.println(“Hijo.m2”);
}
public void m3(){
super.m3();
System.out.println(“Hijo.m3”);
}
}
 */
}
