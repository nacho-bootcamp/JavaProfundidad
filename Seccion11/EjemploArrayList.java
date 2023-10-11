package Seccion11;

import java.util.ArrayList;

public class EjemploArrayList {
  // Internamente es un arreglo y es ineficiente
  // agregar un arreglo en un lugar especifico
  public static void main(String[] args) {
    ArrayList<String> array = new ArrayList<>();
    array.add("Nacho");
    array.add("Eri");
    array.add("Perlita");

    array.add(2, "Dulce");

    System.out.println(array.size());
    System.out.println(array);
  }
}
