package paquetePrueba;


/*Indica què es mostrarà per pantalla quan s'executen cadascuna d'aquestes classes. Primer intenta dir la
solució sense executar el programa i després executa’l al eclipse per a comprovar els teus resultats:
Exercici 1
*/
public class Uno{
	
		private static int metodo ( ) {
		int valor = 0;
		try {
		valor = valor + 1; /* Aqui muestra 1 */
		valor = valor + Integer.parseInt("42"); /* Aqui muestra 43 */ 
		valor = valor + 1 ; /* Aqui muestra 44 */
		System.out.println ("Valor al final del try : " + valor); /* Aqui muestra 44 */
		}
		catch (NumberFormatException e ) {
		valor = valor + Integer. parseInt("42"); /* Aqui no entra, pero daria 42 */
		System.out.println("Valor al final del catch : " + valor); /* Aqui no entra, pero daria 42 */
		}
		finally {
		valor = valor + 1 ; /* Aquí si no hay error y ejecuta metodo, el resultado seria 45 */
		System.out.println("Valor al final de finally : " + valor ) ; /* Aquí si no hay error y ejecuta metodo, el resultado seria 45 */
		}
		valor = valor + 1 ; /* Esto da 46*/
		System.out.println ( "Valor antes del return : " + valor ) ;
		return valor ; /* Esto retorna 46 */
		}
	public static void main (String [ ] args ) {
		try {
	System.out.println (metodo());
	}
		catch (Exception e ) {
	System.err.println("Excepcion en metodo( ) ") ;
	}
  }
}
