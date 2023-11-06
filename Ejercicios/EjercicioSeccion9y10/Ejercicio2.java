package EjercicioSeccion9y10;

public class Ejercicio2 {
  public static void main(String[] args) {

    String arreglo[][] = new String[3][];

    arreglo[0] = new String[3];
    arreglo[0][0] = "";
    arreglo[0][1] = "";
    arreglo[0][2] = "*";

    arreglo[1] = new String[4];
    arreglo[1][0] = "";
    arreglo[1][1] = "*";
    arreglo[1][2] = "";
    arreglo[1][3] = "*";

    arreglo[2] = new String[5];
    arreglo[2][0] = "*";
    arreglo[2][1] = " ";
    arreglo[2][2] = "*";
    arreglo[2][3] = " ";
    arreglo[2][4] = "*";

    for (int i = 0; i < arreglo.length; i++) {
      for (int j = 0; j < arreglo[i].length; j++) {
        System.out.print(arreglo[i][j] + "\t");
      }
      System.out.println();
    }
  }

}
