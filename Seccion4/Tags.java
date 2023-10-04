package Seccion4;

public class Tags {
  public static void main(String args[]) {

    outer: for (int j = 0; j <= 10; j++) {
      inner: for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
          break outer;
        }
        System.out.println(j + "X" + i + "=" + (j * i));
      }
    }
  }
}
