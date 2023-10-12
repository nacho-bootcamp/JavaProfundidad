package Seccion11;

import java.util.TreeMap;

public class EjemploTreeMap {
  public static void main(String[] args) {
    // te lo ordena la key de forma natural y no habra datos repetidos
    TreeMap<String, String> diccionario = new TreeMap<>();
    diccionario.put("Nacho", "programador Java");
    diccionario.put("zi zu", "Futbol");
    diccionario.put("Consiti", "bootcamp");
    System.out.println(diccionario);
  }
}
