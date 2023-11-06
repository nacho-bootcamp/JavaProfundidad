package Seccion10;

public class InicializacionesDeArreglos {

  static void imprimirArreglos(String arreglo[]) {
    for (String valor : arreglo) {
      System.out.println(valor);
    }
  }

  public static void main(String[] args) {
    // forma explicita se utiliza cunado no sepamos los valores

    String nombre[] = new String[2];
    nombre[0] = "nacho";
    nombre[1] = "consiti";
    imprimirArreglos(nombre);

    // forma implicita se utiliza cuando ya sabemos los valores

    String nombre2[] = { "nacho", "consiti" };
    imprimirArreglos(nombre2);
    // forma Anonima
    String nombre3[] = new String[] { "nacho", "Consiti" };
    imprimirArreglos(nombre3);
  }
}
