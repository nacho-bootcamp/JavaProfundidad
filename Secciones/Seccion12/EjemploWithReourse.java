package Seccion12;

class baseDeDatos implements AutoCloseable {
  void Fooo() {
    System.out.println("Foo");
  }

  @Override
  public void close() {
    System.out.println("liberando recursos");

  }

}

public class EjemploWithReourse {
  public static void main(String[] args) {
    try (baseDeDatos recurso = new baseDeDatos()) {
      recurso.Fooo();
    }
  }
}
