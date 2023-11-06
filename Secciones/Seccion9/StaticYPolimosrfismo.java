package Seccion9;

class A {
  static void foo() {
    System.err.println("Foo");
  }
}

class B extends A {
  static void foo() {
    System.out.println("Foo2");
  }
}

public class StaticYPolimosrfismo {
  public static void main(String[] args) {
    A a = new B();
    a.foo();

  }
}
