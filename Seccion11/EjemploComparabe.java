package Seccion11;

import java.util.TreeSet;

class Perro implements Comparable<Perro> {
  private String nombre;

  public Perro(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Perro [nombre=" + nombre + "]";
  }

  @Override
  public int compareTo(Perro p) {
    // ascendente
    // return nombre.compareTo(p.getNombre());

    // descendente
    return p.getNombre().compareTo(nombre);
  }
}

public class EjemploComparabe {
  public static void main(String[] args) {
    // te lo ordena de forma natural y no habra datos repetidos
    TreeSet<Perro> lista = new TreeSet<>();
    lista.add(new Perro("Chavo"));
    lista.add(new Perro("Luis"));
    lista.add(new Perro("Don Ramon"));
  }
}
