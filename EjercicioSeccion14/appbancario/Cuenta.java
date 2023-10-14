package EjercicioSeccion14.appbancario;

class SaldoInsuficienteException extends Exception {
  public SaldoInsuficienteException(String mensaje) {
    super(mensaje);
  }
}

class ErrorDeAlIngresarContraseñaException extends Exception {
  public ErrorDeAlIngresarContraseñaException(String mensaje) {
    super(mensaje);
  }
}

public class Cuenta {
  private double saldo;
  private int codigo;
  String nombreDeCuenta;

  public Cuenta() {
  }

  public Cuenta(String nombreDeCuenta, int codigo) {
    this.nombreDeCuenta = nombreDeCuenta;
    this.codigo = codigo;
  }

  public synchronized void depositar(double valor) {
    try {
      saldo += valor;
      System.out.println("Se deposito exitosamente");
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  public void ingresarCuenta(int contraseña) throws ErrorDeAlIngresarContraseñaException {
    if (contraseña != this.codigo) {
      throw new ErrorDeAlIngresarContraseñaException("Error al ingresa a la cuenta");
    } else {
      System.out.println("Bienvenido " + this.nombreDeCuenta + " tu cuenta tiene un saldo de " + this.getSaldo());

    }
  }

  public synchronized void sacar(double valor) throws SaldoInsuficienteException {
    if (this.saldo < valor) {
      throw new SaldoInsuficienteException("No Tienes Saldo suficiente");
    } else {
      saldo -= valor;
      System.out.println("Su retiro fue un exito");
    }
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
