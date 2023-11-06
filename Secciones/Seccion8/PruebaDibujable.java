package Seccion8;

public class PruebaDibujable {
  void pruebaDibujar(Dibujable dibujable) {
    dibujable.dibujar();
  }

  public static void main(String[] args) {
    PruebaDibujable p = new PruebaDibujable();
    p.pruebaDibujar(new Circulo("rojo", 10.0f));
    p.pruebaDibujar(new Cuadro("azul", 14.5f));

    System.out.println(new Cuadro("azul", 14.5f) instanceof Dibujable);
  }
}
