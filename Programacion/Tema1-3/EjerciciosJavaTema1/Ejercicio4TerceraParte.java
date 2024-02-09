//Exercici 3: Demostració dels operadors logics
public class Ejercicio4TerceraParte {
public static void main(String [] args) {
System.out.println("Demostracion de operadores logicos");
System.out.println("Negacion: ! false es : " + (! false));
System.out.println(" ! true es : " + (! true));
System.out.println("Suma: false | false es : " + (false | false));
System.out.println(" false | true es : " + (false | true));
System.out.println(" true | false es : " + (true | false));
System.out.println(" true | true es : " + (true | true));
System.out.println("Producto: false & false es : " + (false & false));
System.out.println(" false & true es : " + (false & true));
System.out.println(" true & false es : " + (true & false));
System.out.println(" true & true es : " + (true & true));
}
}
/*
Eixida per pantalla del programa anterior:
Demostracion de operadores logicos
Negacion: ! false es : true
! true es : false
Suma: false | false es : false
false | true es : true
true | false es : true
true | true es : true
Producto: false & false es : false
false & true es : false
true & false es : false
true & true es : true
*/