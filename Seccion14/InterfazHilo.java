package Seccion14;

class Counter implements Runnable {

  private int valor;

  Counter(int valor) {
    this.valor = valor;
  }

  @Override
  public void run() {
    System.out.printf("Estado %s \n", Thread.currentThread().getState());
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
    System.out.printf("Estado %s \n", contador.getState());
    contador.start();
    contador.join();
    System.out.printf("Estado %s \n", contador.getState());

    // Thread contador2 = new Thread(new Counter(20), "hilo2");
    // contador2.start();
    // System.out.println("Se lanzo los hilos");
    // // si no pongo join primero se va a ejecutar los system y no va a respetar
    // // el orden que quiero que se ejecute
    // contador.join();
    // contador2.join();
    // System.out.println("Fin del programa");

  }
}
