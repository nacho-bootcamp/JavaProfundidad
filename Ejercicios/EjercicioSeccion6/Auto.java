package EjercicioSeccion6;

public class Auto extends Vehiculo {
  int capacidadDePasajero;
  String color;

  Auto(String vehiculo, int velocidadMaxima, String color) {
    super(vehiculo, velocidadMaxima);
    this.color = color;
  }

  Auto(int capacidadDePasajero) {
    this.capacidadDePasajero = capacidadDePasajero;
  }

  void pasajeros() {
    System.out.println("El " + vehiculo + " puede llevar una catidad de " + capacidadDePasajero + " pasajeros");
  }
}
