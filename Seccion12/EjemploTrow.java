package Seccion12;

public class EjemploTrow {
  static double dividir(int a, int b) {
    if (b != 0) {
      return a / b;
    } else {
      throw new IllegalArgumentException("No se puede divir por 0");
    }
  }

  public static void main(String[] args) {
    double resultado = dividir(10, 5);
    System.out.println("resultado " + resultado);
  }
}
