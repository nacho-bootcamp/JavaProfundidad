package EjercicioSeccion4;

public class Factorial {
  public static void main(String[] args) {
    int numero = 4;
    int factorial = 1;
    String formula = numero + "! =";

    if (numero < 0) {
      System.out.println("El factorial no está definido para números negativos.");
    } else {
      for (int i = numero; i >= 1; i--) {
        factorial *= i;
        formula += " " + i;
        if (i > 1) {
          formula += " x";
        }
      }
      System.out.println(formula + " = " + factorial);
    }
  }
}
