package Seccion8;

public class Cuadro extends Figura implements Dibujable {

  private double lado;

  Cuadro(String color, double lado) {
    super(color);
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    return lado * lado;
  }

  @Override
  public void dibujar() {
    System.out.println("Se dibujo un Cuadro");
  }

}
