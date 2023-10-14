package Seccion14;

class Counter implements Runnable {

  private int valor;

  Counter(int valor) {
    this.valor = valor;
  }

  @Override
  public void run() {
    for (int i = valor; i >= 0; i--) {
      System.out.printf("%s Valor %d \n", Thread.currentThread().getName(), i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }

    }
  }

}

public class InterfazHilo {
  public static void main(String[] args) throws InterruptedException {
    Thread contador = new Thread(new Counter(10), "hilo1");
    contador.start();
    Thread contador2 = new Thread(new Counter(20), "hilo2");
    contador2.start();
    System.out.println("Se lanzo los hilos");
    contador.join();
    contador2.join();
    System.out.println("Fin del rpograma");

  }
}
