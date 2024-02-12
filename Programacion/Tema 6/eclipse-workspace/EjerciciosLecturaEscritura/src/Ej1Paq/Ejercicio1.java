package Ej1Paq;

import java.io.FileWriter;
import java.io.IOException;
public class Ejercicio1 {
private static String FILE_NAME ="fichero1.txt";
public static void main(String[] args) {
try {
FileWriter output = new FileWriter(FILE_NAME);
for(int i=0;i<10;i++){
output.write("UWU\n");
}
output.close();
}
catch(IOException ex) {
System.out.println("Algo malo ha ocurrido");
}
}
} 