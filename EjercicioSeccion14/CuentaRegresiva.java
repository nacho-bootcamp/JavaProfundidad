package EjercicioSeccion14;

// ejercicio 1
import java.util.Random;

class Counter extends Thread {
  private int valor;

  Counter(int valor, String name) {
    super(name);
    this.valor = valor;
  }

  @Override
  public void run() {
    System.out.printf("Hilo %s estado: %s%n", getName(), getState());
    for (int i = valor; i >= 0; i--) {
      System.out.printf("Hilo %s indice %d%n", getName(), i);
    }
    try {
      Thread.sleep(new Random().nextInt(500));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}

public class CuentaRegresiva {
  public static void main(String[] args) {
    Counter[] hilo = new Counter[10];

    for (int i = 0; i < 10; i++) {
      hilo[i] = new Counter(15, "contador" + i);
      hilo[i].start();
    }
    try {
      Counter hiloGanador = null;
      for (Counter hilo1 : hilo) {
        System.out.printf("Hilo %s ha terminado.%n", hilo1.getName());
        if (hiloGanador == null || hilo1.getState() == Thread.State.TERMINATED) {
          hiloGanador = hilo1;
          hiloGanador.join();
        }
      }
      System.out.printf("El hilo ganador es: %s%n", hiloGanador.getName());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
