package Seccion11;

import java.util.LinkedList;

public class EjemploLinkedList {
  public static void main(String[] args) {
    LinkedList<String> lista = new LinkedList<>();
    lista.add("nacho");
    lista.add("Consiti");
    lista.add("Java");

    // Usando peek() para acceder al primer elemento sin eliminarlo
    System.out.println(lista.peek());
    // Usando poll() para acceder y eliminar el primer elemento
    System.out.println(lista.poll());
    System.out.println(lista.getFirst());
    System.out.println(lista.getLast());

  }
}
