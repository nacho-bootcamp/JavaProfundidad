package Seccion10;

public class EjemploArrayMultidimensionales {
  public static void main(String[] args) {
    int arreglo[][] = new int[2][2];
    arreglo[0][0] = 20;
    arreglo[0][1] = 155;
    arreglo[1][0] = 200;
    arreglo[1][1] = 28;

    for (int i = 0; i < arreglo.length; i++) {
      for (int j = 0; j < arreglo[i].length; j++) {
        System.out.println(arreglo[i][j]);
      }
    }
  }
}
