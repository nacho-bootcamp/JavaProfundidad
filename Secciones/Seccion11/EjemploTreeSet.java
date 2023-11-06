package Seccion11;

import java.util.TreeSet;

public class EjemploTreeSet {
  public static void main(String[] args) {
    // te lo ordena de forma natural y no habra datos repetidos
    TreeSet<String> lista = new TreeSet<>();
    lista.add("nacho");
    lista.add("Consiti");
    lista.add("Consiti");
    lista.add("Java");
    lista.add("ziii");
    System.out.println(lista);
  }
}
