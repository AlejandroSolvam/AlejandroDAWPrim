package pruebaProyecto;
import vehiculoProyecto.Vehiculo;
import AvionProyecto.Avion;
import BarcoProyecto.Barco;
import helicopteroProyecto.Helicoptero;
import vehiculoAcuaticoProyecto.Acuatico;
import vehiculoAereoProyecto.Aereo;
import VeleroProyecto.Velero;

public class Prueba {
 public static void main(String[] args) {
Vehiculo miVehiculo = new Vehiculo();
miVehiculo.setNombreVehiculo("El Gran Vehiculo");
System.out.println("usando miVehiculo, nombreVehiculo : "+miVehiculo.getNombreVehiculo());
System.out.println("usando miVehiculo llama a: "+miVehiculo.setTransportar());
System.out.println();
Acuatico miAcuatico= new Acuatico();
miAcuatico.setNombreVehiculo("El Acuático");
System.out.println("usando miAcuatico, nombreVehiculo : "+miAcuatico.getNombreVehiculo());
System.out.println("usando miAcuatico llama a : "+miAcuatico.setTransportar());
System.out.println("usando miAcuatico llama a : "+miAcuatico.navegar());
System.out.println();
Barco miBarco=new Barco();
miBarco.setNombreVehiculo("Titanic");
System.out.println("usando miBarco, nombreVehiculo : "+miBarco.getNombreVehiculo());
System.out.println("usando miBarco llama a : "+miBarco.setTransportar());
System.out.println("usando miBarco llama a : "+miBarco.navegar());
System.out.println("usando miBarco llama a : "+miBarco.prenderMotor());
System.out.println();
Velero miVelero=new Velero();
miVelero.setNombreVehiculo("Veleron");
System.out.println("usando miVelero, nombreVehiculo : "+miVelero.getNombreVehiculo());
System.out.println("usando miVelero llama a : "+miVelero.setTransportar());
System.out.println("usando miVelero llama a : "+miVelero.navegar());
System.out.println("usando miVelero llama a : "+miVelero.izarVelas());
System.out.println();
Aereo miAereo= new Aereo();
miAereo.setNombreVehiculo("El Aereo");
System.out.println("usando miAereo, nombreVehiculo : "+miAereo.getNombreVehiculo());
System.out.println("usando miAereo llama a : "+miAereo.setTransportar());
System.out.println("usando miAereo llama a : "+miAereo.volar());
System.out.println();
Avion miAvion=new Avion();
miAvion.setNombreVehiculo("El Condor");
System.out.println("usando miAvion, nombreVehiculo : "+miAvion.getNombreVehiculo());
System.out.println("usando miAvion llama a : "+miAvion.setTransportar());
System.out.println("usando miAvion llama a : "+miAvion.volar());
System.out.println("usando miAvion llama a : "+miAvion.bajarTrenDeAterrizaje());
System.out.println();
Helicoptero miHelicoptero=new Helicoptero();
miHelicoptero.setNombreVehiculo("El lobo del Aire");
System.out.println("usando miHelicoptero, nombreVehiculo :"+miHelicoptero.getNombreVehiculo());
System.out.println("usando miHelicoptero llama a : "+miHelicoptero.setTransportar());
System.out.println("usando miHelicoptero llama a : "+miHelicoptero.volar());
System.out.println("usando miHelicoptero llama a : "+miHelicoptero.encenderHelices());
System.out.println();
System.out.println("nombre Vehiculo :"+miVehiculo.getNombreVehiculo());
System.out.println("nombre Acuatico :"+miAcuatico.getNombreVehiculo());
System.out.println("nombre Aereo :"+miAereo.getNombreVehiculo());
System.out.println("nombre Barco :"+miBarco.getNombreVehiculo());
System.out.println("nombre Velero :"+miVelero.getNombreVehiculo());
System.out.println("nombre Avion :"+miAvion.getNombreVehiculo());
System.out.println("nombre Helicoptero :"+miHelicoptero.getNombreVehiculo());
System.out.println();
 }
}