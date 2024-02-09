/* Exercici 2. Quin es el resultat del següent programa?*/

class Ejercicio2 {
public static void main(String [] args) {
char a='g';
switch (a) {
case 'g': /* El switch entra a este case porque aunque la única variable que hay declarada sea a, lo que
importa es el valor de a, y este es 'g', como el case que hay en esta línea. */
a++;/* Aquí el valor de la variable a=g pasa a ser h, uno más dentro del alfabeto */
default:
if (a<'g') /* Esta línea no se ejecuta, ya que se intenta comparar
una variable que contiene un carácter con que sea menor a 'g', y g en la tabla Ascii no es menor 
que el valor que contiene a (h), por lo que se redirige al else. */
a--;
else
a='m';/* La variable a ahora se le asigna como valor 'm' */
}
System.out.println(a); /* Se muestra por pantalla la variable a con el valor 'm' */
}
}