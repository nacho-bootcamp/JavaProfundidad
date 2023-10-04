package Seccion4;

public class UsoIf {
  public static void main(String[] args) {
    int edad = 18;
    boolean puedeEntrar = edad >= 18;
    if (puedeEntrar) {
      System.out.println("Puede ingresar al lugar");
    } else if (edad <= 15) {
      System.out.println("Llamar a sus padres y no permitir entrar");
    } else {
      System.out.println("Solo se epermite mayor de edad");
    }
  }
}
