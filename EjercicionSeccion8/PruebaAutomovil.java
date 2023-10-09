package EjercicionSeccion8;

public class PruebaAutomovil {

  void calculadorDePeajes(Automovil automovil) {
    System.out.println("El auto de la marca " + automovil.marca + " segun su distancia le queda en el tanque "
        + automovil.calcularConsumoDeGasolina());
  }

  void costoPeaje(Automovil automovil) {
    System.out
        .println("El camioneta de la marca " + automovil.marca + " segun su mantenimiento tiene un costo de peaje de "
            + automovil.calcularCostoPeaje());
  }

  public static void main(String[] args) {
    PruebaAutomovil prueba = new PruebaAutomovil();
    prueba.calculadorDePeajes(new Ferrari("Ferrari", "negro", 350, 100, 40));
    prueba.costoPeaje(new Lamborghini("Ferrari", "negro", 350, 100, true));

  }
}
