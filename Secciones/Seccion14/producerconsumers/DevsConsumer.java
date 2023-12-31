package Seccion14.producerconsumers;

import java.util.Random;

public class DevsConsumer extends Thread {
  private DevsResource resource;

  public DevsConsumer(DevsResource resource, String name) {
    super(name);
    this.resource = resource;
  }

  @Override
  public void run() {
    while (true) {
      int value;
      try {
        value = resource.consume();
        System.out.printf("%s consume %d \n", getName(), value);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try {
        Thread.sleep(new Random().nextInt(150));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
