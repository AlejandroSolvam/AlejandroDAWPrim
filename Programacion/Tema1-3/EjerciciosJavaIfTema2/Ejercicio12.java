/* 12. Demana el día, mes i any d’una data correcta i mostra la data del dia següent. Suposem que tots
els mesos tenen 30 dies. */

import java.util.Scanner;

public class Ejercicio12{
    public static void main(String [] args){
        int NumDia, NumMes, NumAño;
        int enero=1, febrero=2, marzo=3, abril=4, mayo=5, junio=6, julio=7, agosto=8, septiembre=9, octubre=10, noviembre=11, diciembre=12;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el día:");
        NumDia=Lectura.nextInt();
        System.out.println("Introduce el mes:");
        NumMes=Lectura.nextInt();
        System.out.println("Introduce el año:");
        NumAño=Lectura.nextInt();

        if(NumMes==enero){
            if(NumDia>=0 && NumDia<=29){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Enero)");
                System.out.println("Año "+ NumAño);
            }
                else if(NumDia==30){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Febrero)");
                System.out.println("Año "+ NumAño);
            } else {
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==febrero){
            if(NumDia>=0 && NumDia<=27){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Febrero)");
                System.out.println("Año "+ NumAño);
                } 
                else if(NumDia==28 || NumDia==29){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Marzo)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==marzo){
            if(NumDia>=0 && NumDia<=30){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Marzo)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==31){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Abril)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==abril){
            if(NumDia>=0 && NumDia<=29){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Abril)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==30){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Mayo)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==mayo){
            if(NumDia>=0 && NumDia<=30){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Mayo)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==31){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Junio)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==junio){
            if(NumDia>=0 && NumDia<=29){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Junio)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==30){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Julio)");
                System.out.println("Año "+ NumAño);
                }
                System.out.println("La fecha es falsa");
            }else if(NumMes==julio){
            if(NumDia>=0 && NumDia<=30){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Julio)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==31){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Agosto)");
                System.out.println("Año "+ NumAño);
                }else {
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==agosto){
            if(NumDia>=0 && NumDia<=30){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Agosto)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==31){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Septiembre)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==septiembre){
            if(NumDia>=0 && NumDia<=29){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Septiembre)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==30){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Octubre)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==octubre){
            if(NumDia>=0 && NumDia<=30){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Octubre)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==31){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Noviembre)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==noviembre){
            if(NumDia>=0 && NumDia<=29){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Noviembre)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==30){
                System.out.println("Día 1");
                System.out.println("Mes "+(NumMes+1)+" (Diciembre)");
                System.out.println("Año "+ NumAño);
                }else{
                System.out.println("La fecha es falsa");
            }
        } else if(NumMes==diciembre){
            if(NumDia>=0 && NumDia<=30){  
                System.out.println("La fecha es verdadera");
                System.out.println("Día "+NumDia);
                System.out.println("Mes "+(NumMes)+" (Diciembre)");
                System.out.println("Año "+ NumAño);
                }
                else if(NumDia==31){
                System.out.println("Día 1");
                System.out.println("Mes (Enero)");
                System.out.println("Año "+ (NumAño+1));
                }else{
                System.out.println("La fecha es falsa");
            }
        } else {
            System.out.println("La fecha es falsa");
        }
    }
}


