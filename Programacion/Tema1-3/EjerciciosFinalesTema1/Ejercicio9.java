/* Exercici 9. El següent programa escrit en Java presenta nombroses errades de programació.
Detecta i corregeix dites errades. Per a això, deuràs compilar tantes vegades com siga necessari fins que
no existeixca cap errada. Una vegada compilat sense errades, hauràs d’executar-ho. Recorda anomenar
tots els canvis fets i quines solucions li has donat. */

public class Ejercicio9{
    public static void main(String[] args){

  int a;
  int b;
  int resultado;
  resultado=0; /* La variable es en minúsculas y en la imagen sale la R mayúscula, también se utiliza para asignar
  el valor :=, y esto es erróneo, sólo hay que poner para que sea de forma correcta: resultado= 0; */
  System.out.println("Suma de dos números");

  a=2; /* "La variable A no ha sido declarada, por lo que esta nos va a generar errores, para evitarlo, tendremos que
  declararla antes de querer darle un valor" */
  b=1;/* La variable "b" ha sido declarada como minúscula, y en el código se está utilizando para asignarle un valor
  la letra B mayúscula, tendremos que ponerlo como lo hemos declarado previamente */
  resultado=b+a;/* Tanto "resultado" como "a" están declarados en minúscula, y se están utilizando en mayúscula,
  introduzcamos las variables de manera correcta. */
  System.out.println("El resultado de la suma sera de " + resultado);/* No tiene sentido la línea que había escrita
  previamente, si queremos mostrar el resultado será suficiente con poner la variable "resultado" con su sintáxis 
  correcta, aparte, la variable estaba siendo utilizada de manera errónea ya que se estaba utilizando en mayúsculas
  y además entre comillas, es decir, estaba siendo utilizada una asignación dentro de una cadena de texto, y esto
  es completamente erróneo. */
  }
}