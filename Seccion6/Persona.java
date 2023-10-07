package Seccion6;

public class Persona {
  String nombre;
  String fechaDeNacimiento;

  Persona(String nombre, String fechaDeNacimiento) {
    this.nombre = nombre;
    this.fechaDeNacimiento = fechaDeNacimiento;
  }

  void dormir() {
    System.out.println("Soy " + nombre + " y estoy durmiendo");
  }

  void respirar() {
    System.out.println("Soy " + nombre + " y estoy respiradno desde " + fechaDeNacimiento);
  }

  void correr() {
    System.out.println("Soy " + nombre + " y estoy corriendo");
  }
}
