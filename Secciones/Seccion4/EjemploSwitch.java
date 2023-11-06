package Seccion4;

public class EjemploSwitch {
  public static void main(String[] args) {
    int opcion = 0;
    // en este caso la linea 13 no tiene el break el codigo va a seguir compilando
    // pero
    // va a mostrar en pantalla el caso 0 y 1
    switch (opcion) {
      case 0:
        System.out.println("Opcion 0");

      case 1:
        System.out.println("Opcion 1");

      case 2:
        System.out.println("Opcion 2");
        break;
      case 3:
        System.out.println("Opcion 3");
        break;
      case 4:
        System.out.println("Opcion 4");
        break;
      default:
        System.out.println("Opcion default");
        break;

    }
  }
}
