package Seccion12;

class TituloIncorrectoException extends RuntimeException {
  public TituloIncorrectoException(String error) {
    super(error);
  }
}

public class ExcepcionPropia {
  static void crearCurso(String titulo) {

    if (!titulo.toUpperCase().equals(titulo)) {
      throw new TituloIncorrectoException("Debe estar en mayuscula");
    }
    System.out.println("Titulo Correcto");
  }

  public static void main(String[] args) {
    crearCurso("JAVA A PROFUNDIDAD DESDE CERO");
  }
}
