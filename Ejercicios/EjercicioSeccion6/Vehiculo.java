package EjercicioSeccion6;

public class Vehiculo {
  String vehiculo;
  int velocidadMaxima;
  double precio;
  String estadoDelVehiculo;

  Vehiculo(String vehiculo, int velocidadMaxima) {
    this.vehiculo = vehiculo;
    this.velocidadMaxima = velocidadMaxima;
  }

  Vehiculo(String vehiculo, int velocidadMaxima, double precio, String estadoDelVehiculo) {
    this(vehiculo, velocidadMaxima);
    this.precio = precio;
    this.estadoDelVehiculo = estadoDelVehiculo;
  }

  Vehiculo() {
    this("Automivil", 250);
    System.out.println("Constructor por defecto");
  }

  void velocidad() {
    System.out.println(vehiculo + " tiene una velocidad maxima de " + velocidadMaxima);
  }

  void proteccionContraChoques() {
    System.out.println("El " + vehiculo + " cuando sufre un choque te proteje las bolsas de aire ");
  }
}
