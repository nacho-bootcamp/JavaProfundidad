package EjercicioSeccion4;

public class Tablas {
  public static void main(String[] args) {

    for (int j = 0; j <= 20; j++) {
      for (int i = 0; i <= 11; i++) {
        if (i > 10) {
          System.out.println("La tabla del " + j + " Termino");
          continue;
        }
        System.out.println(i + " X " + j + " = " + (j * i));
      }
    }

  }
}
