package Seccion12;

import java.nio.file.FileAlreadyExistsException;

//Excepcion Check
public class EjemploTrow {
  /**
   * Manejar excepciones sera una de dos cosas
   * _Atrapar la excepcion try catch
   * _Propagar a quien invoco el metodo
   * 
   */
  static double dividir(int a, int b) throws Exception, FileAlreadyExistsException {
    if (b != 0) {
      return a / b;
    } else {
      throw new Exception("No se puede divir por 0");
    }
  }

  public static void main(String[] args) throws Exception {
    double resultado = dividir(10, 5);
    System.out.println("resultado " + resultado);
  }
}
