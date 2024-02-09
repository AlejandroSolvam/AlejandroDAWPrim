/* Exercici 10: Què mostrarà el següent codi per pantalla? */

public class Ejercicio10{
    public static void main(String[] args){

    int num=5;
    num += -1 * 4 + 1; /* Empezaremos por la parte de la derecha
    despues del +=, por orden primero se hace el (-1*4)=-4, a
    continuación se hace (-4+1)=-3 y por último haremos la
    operación de la izquierda (num(5) += -3=2)  */
    System.out.println(num);
    num=4;
    num %=7 * num % 3 * 7 >> 1; /* Empezaremos por la parte de la 
    derecha despues del %=, por orden primero se hace el (7*num(4)=28)
    , a continuación se hace (28%3=1), luego (1*7=7) y 
    (7>>1)= (7=0111 en binario desplazando un bit a la derecha=
    0011, este número binario equivale a 3)
    por último haremos la operación de la izquierda
    (num(4) %=3), que tiene como resultado un 1.
    */
    System.out.println(num);

    }
}