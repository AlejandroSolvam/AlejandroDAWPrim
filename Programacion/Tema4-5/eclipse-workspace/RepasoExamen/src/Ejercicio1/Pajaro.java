package Ejercicio1;

/* 2. Està correctament definida la següent classe? Compilarà o caldrà modificar-la per a poder generar el
fitxer .class?*/

class Pajaro {
public void setEdad(int e){
 edad = e;
}
public void printEdad(){
System.out.println(edad);
}
public void setcolor(char c) {
color = c; /* Color es en minuscula */
}
private char color;
private int edad;
}
