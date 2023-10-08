package Seccion7.paquete2;

import Seccion7.paquete1.EjemploProtected;

public class PruebaEjemploProtected extends EjemploProtected {
  void bar() {
    foo();
  }

  public static void main(String[] args) {
    PruebaEjemploProtected e = new PruebaEjemploProtected();
    e.bar();
  }
}
