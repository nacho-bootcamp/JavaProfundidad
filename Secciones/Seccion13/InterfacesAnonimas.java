package Seccion13;

interface Jugable {
  void jugar();
}

public class InterfacesAnonimas {
  public static void main(String[] args) {
    Jugable j = new Jugable() {
      @Override
      public void jugar() {
        System.out.println("Jugando");
      }
    };
    j.jugar();
  }
}
