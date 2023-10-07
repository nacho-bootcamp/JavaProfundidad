package Seccion6;

public class Empleado extends Persona {
  float sueldo;

  void trabajar() {
    System.out.println("Soy " + nombre + " y estoy trabajando");
  }

  void cobrar() {
    System.out.println("Soy " + nombre + " y hoy cobre " + sueldo);
  }
}
