/* Exercici 2: Realitza les següents figures: (Utilitza bucles while).
 una línia composta per asteriscs (*) de 10 de larg. Cada impressió sols portarà un
caràcter.
**********
una línia composta por uns (1) i ceros (0) intercalats de 20 de larg. Cada impressió sols
portarà un caràcter.
10101010101010101010  

una línia composta per seqüencies de quatre uns (1) i un cero (0) succesius de 25 de
larg.
 1111011110111101111011110
 
un quadre compost per signes més (+) de 5 files i 10 columnes
 ++++++++++
 ++++++++++
 ++++++++++
 ++++++++++
 ++++++++++

 un quadre compost per signes igual (=) alternats amb signes menys (-) de 6 files i 10
columnes
 =-=-=-=-=-
 =-=-=-=-=-
 =-=-=-=-=-
 =-=-=-=-=-
 =-=-=-=-=-
 =-=-=-=-=-

 un triangle isósceles de 10 de altura, compost per lletres 'o'
 o
 oo
 ooo
 oooo
 ooooo
 oooooo
 ooooooo
 oooooooo
 ooooooooo
 oooooooooo

 el mateix triangle, però invertit i composto por lletres 'o'
 oooooooooo
 ooooooooo
 oooooooo
 ooooooo
 oooooo
 ooooo
 oooo
 ooo
 oo
 o

 un rectangle buit compost per coixinets '#' de costats 10x5
 ##########
 #        #
 #        #
 #        #
 ##########
 */

public class Ejercicio2{
    public static void main(String [] args){
        int i=1;
        int j=1;
        int validador=0;
while(i<=10){
    System.out.print("*");
    i++;
}
System.out.print("\n");
System.out.print("\n");   




    i=1;
while(i<=10){
    System.out.print("1");
    System.out.print("0");
    i++;
}
System.out.print("\n");
System.out.print("\n");   




    i=1;
while(i<=5){
    System.out.print("1");
    System.out.print("1");
    System.out.print("1");
    System.out.print("1");
    System.out.print("0");
    i++;
}
System.out.print("\n");
System.out.print("\n");   




    i=1;
while(i<=5){
  while(j<=10){
    System.out.print("+");
    j++;
  }
  System.out.print("\n");
  i++;
  j=1;
}





System.out.print("\n");   

 i=1;
 j=1;
while(i<=6){
  while(j<=5){
    System.out.print("=");
    System.out.print("-");
    j++;
  }
  System.out.print("\n");
  i++;
  j=1;
}
System.out.print("\n");   





   
 i=1;
 j=1;
while(i<=10){
  while(j<=i){
    System.out.print("O");
    j++;
  }
  System.out.print("\n");
  i++;
  j=1;
}

 System.out.print("\n");





i=10;
j=1;
int z=10;
while(i>=1){
  while(j<=z){
    System.out.print("O");
    j++;
  }
  System.out.print("\n");
  i--;
  z--;
  j=1;

}
 System.out.print("\n");





  i=1;
  j=1;
  z=1;
while(i<=5){
  while(j<=10){
    if(i==1 || i==5){
        System.out.print("#");
         j++;
      }else{
    if(j==1 || j==10){
        System.out.print("#");
        j++;
        }else if(j!=1 && j!=10){
        System.out.print(" ");
        j++;  
        }
      }
    }
      i++;
      j=1;
    System.out.print("\n");
    }
  }
}


