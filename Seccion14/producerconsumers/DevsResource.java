package Seccion14.producerconsumers;

import java.util.LinkedList;

public class DevsResource {
  private LinkedList<Integer> resource = new LinkedList<>();

  public int consume() {
    return resource.poll();
  }

  public void produce(int value) {
    resource.offer(value);
  }
}
