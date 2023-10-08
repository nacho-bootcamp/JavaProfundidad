package Seccion8;

public abstract class Figura {
  private String color;

  Figura(String color) {
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public abstract double calcularArea();

}
