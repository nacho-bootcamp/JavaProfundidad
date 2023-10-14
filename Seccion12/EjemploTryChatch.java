package Seccion12;

public class EjemploTryChatch {
  public static void main(String[] args) {
    try {
      int x = 10;
      int y = 10 / x;
      System.out.println("Despues del Error " + y);
      String nombre = "Ignacio";
      System.out.println(nombre.toString());
      String arr[] = { "raidentrace", "devs4j" };
      System.out.println(arr[3]);
    } catch (ArithmeticException e) {

      System.err.printf("Artimethic exception %s \n", e.getMessage());

    } catch (NullPointerException e) {
      System.err.printf("NullPointer exception %s \n  ", e.getMessage());
    } catch (Exception e) {
      System.err.printf("Exception %s \n  ", e.getMessage());
    } finally {
      System.out.println("Siempre se ejecuta");
    }
  }
}
