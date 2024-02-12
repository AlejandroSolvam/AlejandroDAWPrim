package paqEj4;

public class UsoExcepcionesEncadenadas {
public static void main( String args[] )
{
try {
metodo1(); // llamar a metodo1
}
catch ( Exception excepcion ) {
excepcion.printStackTrace();
}
}
public static void metodo1() throws Exception
{
try {
metodo2();
}
catch ( Exception excepcion ) {
throw new Exception( "Excepcion lanzada en metodo1", excepcion );
}
}
public static void metodo2() throws Exception
{
try {
metodo3();
}
catch ( Exception excepcion ) {
throw new Exception( "Excepcion lanzada en metodo2", excepcion );
}
}
public static void metodo3() throws Exception
{
throw new Exception( "Excepcion lanzada en metodo3" );
}
}