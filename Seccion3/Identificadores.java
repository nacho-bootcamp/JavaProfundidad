package Seccion3;

public class Identificadores {

  public static void main(String args[]) {

    // LOS IDENTIFICADORES NO PUEDEN EMPEZAR CON UN NUMERO
    // double 1sueldo=10000.5;
    // NO PODEMOS UTILIZAR PALABRAS RESERVADAS COMO DOUBLE, FINAL,ETC.
    @SuppressWarnings("unused")
    double sueldo = 10000.5;

    double _$ = 10000.115;
    System.out.println(_$);

    @SuppressWarnings("unused")
    double $ = 10000000.5;

  }
}
