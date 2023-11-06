package Seccion11;

class Perro {
  private String nombre;

  Perro(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Perro) {
      Perro prr = (Perro) obj;
      if (prr.getNombre().equals(nombre)) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

}

public class OperadorVsEquals {
  public static void main(String[] args) {
    Perro p = new Perro("Perlita");
    Perro p1 = new Perro("Perlita");
    System.out.println(p == p1);
  }
}
