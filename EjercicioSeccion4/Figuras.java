package EjercicioSeccion4;

public class Figuras {
  public static void main(String[] args) {
    int n = 4;

    // Imprimir cuadrado
    System.out.println("Figura 1:");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();

    // Imprimir triangulo
    System.out.println("Figura 2:");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();

    // Imprimir triangulo invertido
    System.out.println("Figura 3:");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
