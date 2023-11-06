package EjercicioSeccion8;

public class Lamborghini extends Automovil implements FrenoDeMano {
  int velocidad;
  int distancia;
  boolean mantenimiento;

  Lamborghini(String marca, String color, int velocidad, int distancia, boolean mantenimiento) {
    super(marca, color);
    this.velocidad = velocidad;
    this.distancia = distancia;
    this.mantenimiento = mantenimiento;
  }

  @Override
  public double calcularConsumoDeGasolina() {
    return 0.08 * distancia;
  }

  @Override
  public double calcularCostoPeaje() {
    if (mantenimiento) {
      return distancia * velocidad;
    } else {
      return (distancia * velocidad) - 30;
    }
  }

  @Override
  public void freno() {
    System.out.println("El modelo " + marca + " freno con una velocidad de " + velocidad + " exitosamente");
  }

}
