package Seccion14.producerconsumers;

public class DevsTest {
  public static void main(String[] args) throws InterruptedException {
    DevsResource resource = new DevsResource();

    DevsConsumer consumer1 = new DevsConsumer(resource, "Consumer 1");
    DevsConsumer consumer2 = new DevsConsumer(resource, "Consumer 2");

    DevsProducer producer1 = new DevsProducer(resource, "Producer 1");
    DevsProducer producer2 = new DevsProducer(resource, "Producer 2");

    producer1.start();
    producer2.start();

    consumer1.start();
    consumer2.start();

  }
}
