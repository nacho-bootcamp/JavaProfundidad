package Seccion14;

class SyncCounter {
  static int counter = 10;

  // como hay muchos hilos accediendo al mismo recurso se debe hacer un
  // synchronized
  public synchronized static void decrementor() {
    counter--;
    System.out.println(counter);
  }
}

class Decrementor extends Thread {
  @Override
  public void run() {
    System.out.println("Decrementando SyncCointer");
    SyncCounter.decrementor();
  }
}

public class EjemploSincronizacion {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      new Decrementor().start();
    }
  }
}
