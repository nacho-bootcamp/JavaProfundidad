package EjercicioSeccion14.appbancario;

public class TransaccionBancaria extends Thread {
  private Cuenta cuenta;
  private double monto;

  public TransaccionBancaria(Cuenta cuenta, double monto) {
    this.cuenta = cuenta;
    this.monto = monto;
  }

  @Override
  public void run() {
    try {
      cuenta.sacar(monto);
    } catch (SaldoInsuficienteException e) {
      System.out.println("Error en la transacción: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta("Cuenta1", 1234);
    cuenta.depositar(1000);

    TransaccionBancaria transaccion1 = new TransaccionBancaria(cuenta, 200);
    TransaccionBancaria transaccion2 = new TransaccionBancaria(cuenta, 400);
    TransaccionBancaria transaccion3 = new TransaccionBancaria(cuenta, 700);

    transaccion1.start();
    transaccion2.start();
    transaccion3.start();

    try {
      transaccion1.join();
      transaccion2.join();
      transaccion3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
