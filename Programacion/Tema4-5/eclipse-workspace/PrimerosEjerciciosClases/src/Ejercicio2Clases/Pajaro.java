package Ejercicio2Clases;
/* L */
class Pajaro {
	
public void setEdad(int e){
 edad = e;
}

public void printEdad(){
System.out.println(edad);
}

public void setcolor(char c) {
color = c; /* color tiene que estar declarada de la misma forma, por eso da error */
}

private char color;
private int edad;
}
