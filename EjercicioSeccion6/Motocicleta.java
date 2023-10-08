package EjercicioSeccion6;

public class Motocicleta extends Vehiculo {

  String marca;

  Motocicleta(String vehiculo, int velocidadMaxima, String marca) {
    super(vehiculo, velocidadMaxima);
    this.marca = marca;
  }

  Motocicleta() {
    this("Usado", 200, "Chevrolet");
    System.out.println("Constructor por defecto");
  }

  void marca() {
    System.out.println("Esta" + vehiculo + " es de una marca " + marca);
  }

  @Override
  void proteccionContraChoques() {
    System.out.println("La " + vehiculo + " cuando sufre un choque te proteje el casco ");
  }

}
