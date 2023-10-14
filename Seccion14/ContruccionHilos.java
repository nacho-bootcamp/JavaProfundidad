package Seccion14;

class Devs4jThreas extends Thread {

  public Devs4jThreas(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.printf("Hilo %s indice %d \n ", getName(), i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}

public class ContruccionHilos {
  public static void main(String[] args) {
    Devs4jThreas hilo1 = new Devs4jThreas("hilo1");
    Devs4jThreas hilo2 = new Devs4jThreas("hilo2");

    hilo1.start();
    hilo2.start();
  }
}
