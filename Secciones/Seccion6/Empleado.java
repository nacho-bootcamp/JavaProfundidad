package Seccion6;

public class Empleado extends Persona {
  float sueldo;

  Empleado(String nombre, String fechaDeNacimiento, float sueldo) {
    super(nombre, fechaDeNacimiento);
    this.sueldo = sueldo;
  }

  void trabajar() {
    System.out.println("Soy " + nombre + " y estoy trabajando");
  }

  void cobrar() {
    System.out.println("Soy " + nombre + " y hoy cobre " + sueldo);
  }
}
