package Seccion13;

public class ClaseANivelDeMetodo {

  static void foo() {
    class ClaseInternaDeMetodo {
      void bar() {
        System.out.println("Bar");
      }
    }
    ClaseInternaDeMetodo obj = new ClaseInternaDeMetodo();
    obj.bar();
  }

  public static void main(String[] args) {
    foo();
  }
}
