package EjercicioSeccion4;

public class Tablas {
  public static void main(String[] args) {
    /*
     * 1er Ejercicio
     * Realizar un programa que imprima las tablas de multiplicar del 1 al 20
     * debe existir un espacio entre una y otra para identificarlas
     */
    for (int j = 0; j <= 20; j++) {
      for (int i = 0; i <= 11; i++) {
        if (i > 10) {
          System.out.println("La tabla del " + j + " Termino");
          continue;
        }
        System.out.println(i + " X " + j + " = " + (j * i));
      }
    }

    /*
     * 2do Ejercicio
     * Modificar el programa anterior para que solo se imprima las tablas de
     * multiplicar de numeros pares, para identificar si los numeros son pares
     * puedes utilizar el operador modulo con 2 como se muestra a continuacion:
     * 
     * int x = 2;
     * if(x%2==0){
     * system.out.println("Es par")}
     */

  }
}
