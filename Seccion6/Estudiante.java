package Seccion6;

public class Estudiante extends Persona {
  int numeroDeCuenta;

  void aprobar() {
    System.out.println("Soy " + nombre + " y aprobe mi examen");
  }

  void reprobar() {
    System.out.println("Soy " + nombre + " y desaprobe mi examen");
  }

  float presentarExamen(float nota) {
    return nota;
  }
}
