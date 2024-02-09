/* 4. Es desitja escriure un programa a la classe Ciutadà que calcule si una persona acompleix
les condicions per a ser resident a Espanya.
Suposem que, per a ser resident, es deu acomplir al menys una de les següents condicions:
• Ser de nacionalidad española
• Ser estudiante matriculado en algún estudio oficial
• Ser menor de 18 años y que al menos uno de los padres sea residente
• Ser ciudadano de la EU y tener trabajo o que el cónyuge sea residente
• Ser extranjero y que el cónyuge sea residente Utiliza para resolver el problema if anidados.  */

public class Ejercicio4{
private static int edad = 20;
private static char nacionalidad = 'E'; //francesa
private static boolean conyuge = false;
private static boolean padreResidente= false;
private static boolean madreResidente= false;
private static boolean estudiando = false;
private static boolean trabajando = true;
private static boolean ciudadanoEU= true;
public static void main(String[] args) {
        if (nacionalidad == 'F') {
            System.out.println("Es residente en España porque tiene la nacionalidad española");
        } else if (estudiando == true) {
            System.out.println("Es residente en España porque es estudiante de algún estudio oficial");
        } else if (edad < 18 && (madreResidente == true || padreResidente == true)) {
            System.out.println("Es residente en España ya que es menor de edad y su madre o padre son residentes");
        } else if ((ciudadanoEU == true && trabajando == true) || conyuge == true) {
            System.out.println("Es residente en España porque es ciudadano de la EU y trabaja o tiene un cónyuge de residente");
        } else if (ciudadanoEU == false && conyuge == true) {
            System.out.println("Es residente en España porque aunque seas extranjero, tu conyuge es residente");
        } else {
            System.out.println("El ciudadano no cumple ninguna de las condiciones, por lo tanto, no es residente en España");
        }
    }
}