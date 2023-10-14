package Seccion14.producerconsumers;

import java.util.Random;

public class DevsProducer extends Thread {
  private DevsResource resource;

  public DevsProducer(DevsResource resource, String name) {
    super(name);
    this.resource = resource;
  }

  @Override
  public void run() {
    while (true) {
      try {
        int value = new Random().nextInt(1000);
        System.out.printf("%s produced %d \n", getName(), value);
        resource.produce(value);
        Thread.sleep(new Random().nextInt(150));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
