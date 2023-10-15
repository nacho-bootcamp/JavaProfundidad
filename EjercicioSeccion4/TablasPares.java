package EjercicioSeccion4;

public class TablasPares {
  public static void main(String[] args) {
    for (int j = 1; j <= 20; j++) {
      if (j % 2 == 0) {
        System.out.println("Tabla de multiplicar del " + j + ":");
        for (int i = 1; i <= 10; i++) {
          System.out.println(i + " x " + j + " = " + (j * i));
        }
        System.out.println();
      }
    }
  }
}
