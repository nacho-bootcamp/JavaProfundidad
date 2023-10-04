package Seccion4;

public class SwitchConString {
  public static void main(String[] args) {

    String opcion = "uno";
    switch (opcion) {
      case "cero":
        System.out.println("Opcion 0");
        break;
      case "uno":
        System.out.println("Opcion 1");
        break;
      case "dos":
        System.out.println("Opcion 2");
        break;
      case "tres":
        System.out.println("Opcion 3");
        break;
      default:
        System.out.println("Opcion default");
        break;

    }
  }
}
