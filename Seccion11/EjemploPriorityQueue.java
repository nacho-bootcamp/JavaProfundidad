package Seccion11;

import java.util.PriorityQueue;

public class EjemploPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    // se puedeusar el add o offer
    queue.add(1000);
    queue.add(200);
    queue.add(5);
    queue.add(7);
    System.err.println(queue);
  }
}
