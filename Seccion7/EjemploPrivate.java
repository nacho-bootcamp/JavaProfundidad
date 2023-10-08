package Seccion7;

// el uso de private es que solo se va a poder acceder desde su propia clase
class Prueba {
  @SuppressWarnings("unused")
  private String nombre;

  public Prueba() {
  }

  @SuppressWarnings("unused")
  private void foo() {
  }
}

public class EjemploPrivate {
  public static void main(String[] args) {
    @SuppressWarnings("unused")
    Prueba p = new Prueba();

    // p.foo();
  }
}
