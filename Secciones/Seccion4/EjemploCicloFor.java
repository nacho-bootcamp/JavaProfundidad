package Seccion4;

public class EjemploCicloFor {
  public static void main(String[] args) {

    int tabla = 2;
    for (int i = 0; i < 10; i++) {
      System.out.println(tabla + "X" + i + "=" + (tabla * i));
    }
  }
}
// continue: deja de ejecutar la iteracion actual y salta
// a la siguiente.

// break: rompe el ciclo actual.