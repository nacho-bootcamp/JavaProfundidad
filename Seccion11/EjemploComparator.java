package Seccion11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import javax.script.Compilable;

class Gato {
  private String nombre;
  private String apellido;

  Gato(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Gato [nombre=" + nombre + ",apellido=" + apellido + "]";
  }
}

class OrdanamientoPorNombre implements Comparator<Gato> {

  @Override
  public int compare(Gato o1, Gato o2) {
    return o1.getNombre().compareTo(o2.getNombre());
  }

}

class OrdanamientoPorApellido implements Comparator<Gato> {

  @Override
  public int compare(Gato o1, Gato o2) {
    return o1.getApellido().compareTo(o2.getApellido());
  }

}

public class EjemploComparator {
  public static void main(String[] args) {
    Set<Gato> gatos = new TreeSet<>(new OrdanamientoPorNombre());
    gatos.add(new Gato("Patricio", "Condori"));
    gatos.add(new Gato("Marlon", "Lopez"));
    gatos.add(new Gato("Perlita", "Cardozo"));

    System.out.println(gatos);
  }
}
