package EjercicionSeccion8;

public class Ferrari extends Automovil implements FrenoDeMano {
  double tamañoDelTanque;
  int velocidadM;
  int distancia;

  Ferrari(String marca, String color, int velocidad,
      int distancia, double tamañoDelTanque) {
    super(marca, color);
    this.tamañoDelTanque = tamañoDelTanque;
    this.velocidadM = velocidad;
    this.distancia = distancia;
  }

  @Override
  public double calcularConsumoDeGasolina() {
    return tamañoDelTanque - (0.2 * distancia);
  }

  @Override
  public double calcularCostoPeaje() {
    return distancia * velocidadM;
  }

  @Override
  public void freno() {
    System.out.println("La marca " + marca + " freno con una velocidad de " + velocidadMaxima + " exitosamente");
  }
}
