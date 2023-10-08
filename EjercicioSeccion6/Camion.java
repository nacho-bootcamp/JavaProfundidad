package EjercicioSeccion6;

public class Camion extends Vehiculo {
  int numeroDePuertas;
  int cargaMaxima;

  Camion(String vehiculo, int velocidadMaxima) {
    super(vehiculo, velocidadMaxima);
  }

  Camion(int capacidadDeCarga, int numeroDePuertas) {
    this.cargaMaxima = capacidadDeCarga;
    this.numeroDePuertas = numeroDePuertas;
  }

  void cargas() {
    System.err.println("El " + vehiculo + "es capaz de llevar una carga de " + cargaMaxima);
  }
}
