package Seccion8;

public class PruebaFigura {
  void imprimirArea(Figura figura) {
    System.out.println("El color es " + figura.getColor() + " y tiene un area de " + figura.calcularArea());
  }

  public static void main(String[] args) {
    PruebaFigura p = new PruebaFigura();
    p.imprimirArea(new Circulo("rojo", 10.5));
    p.imprimirArea(new Cuadro("rojo", 15));
    p.imprimirArea(new Rectangulo("verde", 10, 20));
  }
}
