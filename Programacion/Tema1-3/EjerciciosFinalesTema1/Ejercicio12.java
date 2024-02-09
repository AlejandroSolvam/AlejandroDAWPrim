public class Ejercicio12{
    public static void main (String [] args){
            int var=1;
            boolean r,s,t,v;
            r=(var>1) && (var++ <100); /* La parte de la izquierda es falsa, ya que var(1), no es mayor que 1
            La parte de la derecha (var++(2)<100) es verdad, ya que 2 es menor que 100, pero al no cumplirse
            las 2 partes (usando un & tiene que cumplirse las dos partes, r nos devolverá "false") */

            s=(100<var) && (150>var++); /* La parte de la izquierda es falsa, ya que 100, no es menor que 2
            La parte de la derecha (150 < var++(3)) es verdad, ya que 150 es mayor que 3, pero al no cumplirse
            las 2 partes (usando un & tiene que cumplirse las dos partes, s nos devolverá "false") */

            t=(100==var) || (200>var++); /* La parte de la izquierda es falsa, ya que 100, no es igual que 3
            La parte de la derecha (200 > var++(4)) es verdad, ya que 200 es mayor que 4, y al cumplirse
            una de las 2 partes (usando un | tiene que cumplirse una de las partes, con que una sea
            verdad nos basta, t nos devolverá "true") */
            v=(100==var) || (200>var++); /* La parte de la izquierda es falsa, ya que 100, no es igual que 4
            La parte de la derecha (200 > var++(5)) es verdad, ya que 200 es mayor que 5, y al cumplirse
            una de las 2 partes (usando un | tiene que cumplirse una de las partes, con que una sea
            verdad nos basta, v nos devolverá "true") */

            System.out.println(r + " " + s + " " + t + " " + v); /* El ejercicio mostrará por pantalla entonces
            false false true true */
    }
}