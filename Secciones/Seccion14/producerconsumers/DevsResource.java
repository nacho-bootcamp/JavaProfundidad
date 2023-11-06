package Seccion14.producerconsumers;

import java.util.LinkedList;

public class DevsResource {
  private LinkedList<Integer> resource = new LinkedList<>();

  public synchronized int consume() throws InterruptedException {
    while (resource.size() <= 0) {
      wait();
    }

    return resource.poll();
  }

  public synchronized void produce(int value) {
    resource.offer(value);
    notifyAll();
  }
}
