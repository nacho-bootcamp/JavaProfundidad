package Seccion12;

public class ReglasTryCatchFinally {
  // el bloque finally igual se ejecutara si catch tiene un return
  static void test() {
    try {
      System.out.println("bloque try");
      System.exit(0);
    } finally {
      // no llegara hasta aqui si es que hay un system.exit(0)
      System.out.println("bloque finally");
    }
  }

  public static void main(String[] args) {
    // se Puede
    try {

    } catch (Exception e) {

    }
    // se Puede
    try {

    } finally {

    }
    // se Puede
    try {

    } catch (Exception e) {
      // TODO: handle exception
    } finally {

    }

  }
}
