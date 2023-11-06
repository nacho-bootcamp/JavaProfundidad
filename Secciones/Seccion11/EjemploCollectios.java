package Seccion11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollectios {
  public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();
    nombres.add("perlita");
    nombres.add("Marlon");
    nombres.add("patricio");

    Collections.sort(nombres);
    int index = Collections.binarySearch(nombres, "perlita");
    System.out.println(nombres.get(index));
    System.out.println(nombres);
  }
}
