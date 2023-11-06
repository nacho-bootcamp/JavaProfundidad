package Seccion13;

class ExternalStatic {
  public void foo() {
    System.out.println("Foo");
  }

  static class InternalStatic {
    void bar() {
      System.out.println("Bar");
    }
  }
}

public class ClasesInternasEstaticas {
  public static void main(String[] args) {
    ExternalStatic.InternalStatic obj = new ExternalStatic.InternalStatic();
    obj.bar();
  }
}
