package EjercicioSeccion6;

public class EjemploVehiculo {
  public static void main(String[] args) {
    Motocicleta moto1 = new Motocicleta("Motocicleta", 150, "criptonita");
    moto1.proteccionContraChoques();

    Auto auto1 = new Auto("Automovil", 250, "negro");
    auto1.proteccionContraChoques();
  }
}
