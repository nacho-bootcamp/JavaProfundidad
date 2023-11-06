package Seccion8;

public class Rectangulo extends Figura {
  private double base;
  private double altura;

  Rectangulo(String color, double altura, double base) {
    super(color);
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  @Override
  public double calcularArea() {
    return base * altura;
  }

}
