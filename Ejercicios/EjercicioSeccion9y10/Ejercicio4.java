package EjercicioSeccion9y10;

public class Ejercicio4 {
  public static void main(String[] args) {

    int resultado[][] = new int[2][2];
    int arreglo1[][] = new int[2][2];
    int arreglo2[][] = new int[2][2];

    arreglo1[0][0] = 12;
    arreglo1[1][0] = 32;
    arreglo1[0][1] = 52;
    arreglo1[1][1] = 62;

    arreglo2[0][0] = 5;
    arreglo2[1][0] = 15;
    arreglo2[0][1] = 25;
    arreglo2[1][1] = 35;

    for (int i = 0; i < arreglo1.length; i++) {
      for (int j = 0; j < arreglo1[i].length; j++) {
        resultado[i][j] = arreglo1[i][j] + arreglo2[i][j];
      }
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(resultado[i][j] + " ");
      }
      System.out.println();
    }
  }
}
