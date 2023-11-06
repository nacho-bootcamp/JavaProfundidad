package Seccion11;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericoEnMetodos {
  static double sumarValores(List<? extends Number> valores) {
    double suma = 0.0;
    for (Number valor : valores) {
      suma += valor.doubleValue();
    }
    return suma;
  }

  public static void main(String[] args) {
    double sumarValores = sumarValores(Arrays.asList(10.5, 11.6, 10, 5454));
    System.out.println(sumarValores);
  }
}
