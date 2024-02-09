package Ejercicio3;
 /* Exercici 3
Crear una Classe Data a Java. La classe tindrà tres atributs privats dia, mes i any de tipus int. La classe
contindrà els següents mètodes:
Constructor per defecte.
Constructor amb tres paràmetres per a crear objectes amb valors inicials.
Mètodes Setters/getters
Escriu un programa per a provar la classe Data.  */
public class Fecha {
	 
	 private int dia;
	 private int mes;
	 private int año;
	 
	 Fecha(){
		 this.dia=10;
		 this.mes=2;
		 this.año=2003;
	 }
	 
	 Fecha(int day,int newMes, int newAño){
		 this.setDia(day);
		 this.setMes(newMes);
		 this.setAño(newAño);
	 }
	 
	 void setDia(int d) {
		 this.dia=d;
	 }
	 
	 int getDia() {
		 return this.dia;
	 }
	 
	 void setMes(int m) {
		 this.mes=m;
	 }
	 
	 int getMes() {
		 return this.mes;
	 }
	 
	 void setAño(int a) {
		 this.año=a;
	 }
	 
	 int getAño() {
		 return this.año;
	 }
}
