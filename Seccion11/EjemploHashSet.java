package Seccion11;

import java.util.HashSet;

public class EjemploHashSet {
  public static void main(String[] args) {
    // no importa el orden y no habredatos repetidos
    HashSet<String> lista = new HashSet<>();
    lista.add("nacho");
    lista.add("nacho");
    lista.add("Consiti");
    lista.add("Java");
    lista.add(null);
    System.out.println(lista);
  }
}
