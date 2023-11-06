package EjercicioSeccion14;

import java.util.Random;

class CountadoModificado extends Thread {
  private int valor;

  CountadoModificado(int valor, String name) {
    super(name);
    this.valor = valor;
  }

  @Override
  public void run() {
    for (int i = valor; i >= 0; i--) {
      System.out.printf("Hilo %s indice %d%n", getName(), i);

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class CuentaRegresivaModificado {
  public static void main(String[] args) {

    CountadoModificado[] hilo = new CountadoModificado[30];

    for (int i = 0; i < 30; i++) {
      hilo[i] = new CountadoModificado(new Random().nextInt(50), "contador" + i);
      hilo[i].setPriority(Thread.MIN_PRIORITY + i % (Thread.MAX_PRIORITY - Thread.MIN_PRIORITY + 1));
      hilo[i].start();
    }

    try {
      for (CountadoModificado hilos : hilo) {
        hilos.join();
        System.out.printf("Hilo %s ha terminado.%n", hilos.getName());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
