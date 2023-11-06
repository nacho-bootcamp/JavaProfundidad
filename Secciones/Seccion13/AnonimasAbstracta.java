package Seccion13;

abstract class FiguraAnonima {
  abstract void foo();
}

public class AnonimasAbstracta {
  public static void main(String[] args) {
    FiguraAnonima figura = new FiguraAnonima() {
      @Override
      void foo() {
        System.out.println("Bar");
      }
    };
    figura.foo();
  }
}
