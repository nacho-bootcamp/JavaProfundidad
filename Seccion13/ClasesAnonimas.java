package Seccion13;

class EjemploAnonimo {
  void foo() {
    System.out.println("Foo");
  }
}

public class ClasesAnonimas {
  public static void main(String[] args) {
    EjemploAnonimo obj = new EjemploAnonimo() {
      @Override
      void foo() {
        System.out.println("Bar");
      }
    };
    obj.foo();
  }
}
