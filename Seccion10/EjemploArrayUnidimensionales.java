package Seccion10;

public class EjemploArrayUnidimensionales {
  public static void main(String[] args) {
    int array[] = new int[3];
    array[0] = 20;
    array[1] = 1;
    array[2] = 14;
    // System.out.println(array[0]);
    // System.out.println(array[1]);
    // System.out.println(array[2]);

    // for (int i = 0; i < array.length; i++) {
    // System.out.println(array[i]);
    // }

    // int i = 0;

    // while (i < array.length) {
    // System.out.println(array[i]);
    // i++;
    // }
    for (int i : array) {
      System.out.println(i);
    }
  }
}
