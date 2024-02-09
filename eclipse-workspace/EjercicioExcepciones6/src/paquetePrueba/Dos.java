package paquetePrueba;


	public class Dos {
		private static int metodo ( ) {
		int valor = 0;
		try {
		valor = valor +1; /* Valor es 1 */
		valor = valor + Integer. parseInt("W"); /* Aquí ocurre un error, por lo que se deja de mostrar el try */
		valor = valor + 1;
		System.out.println ("Valor al final del try: " + valor);
		}
		catch (NumberFormatException e ) {
		valor = valor + Integer.parseInt("42"); /* Aquí valor es 43 */
		System.out.println ( "Valor al final del catch : " + valor); /* Este valor final es 43, se va a mostrar */
		}
		finally {
		valor = valor + 1; /* Este valor es 44 */
		System.out.println("Valor al final de finally : " + valor ) ; /* El finally muestra 44 */
		}
		valor = valor + 1; /* Valor es 45 */
		System.out.println ("Valor antes del return : " + valor); /* Se muestra que se va a retornar 45 */
		return valor ; /* Se retorna 45 */
		}
			public static void main (String [] args) {
			try {
			System.out.println (metodo ( ) ) ; /* Se muestra el retorno */
			}
			catch ( Exception e ) {
			System.err.println ("Excepcion en metodo ( ) ") ;
			}
			}
}