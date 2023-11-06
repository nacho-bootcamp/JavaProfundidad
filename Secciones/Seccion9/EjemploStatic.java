package Seccion9;

class Humano {
  static int numeroHumanos = 0;
  String nombre;

  public Humano() {
  }

  public Humano(String nombre) {
    this.nombre = nombre;
  }

  // bloque anonimo se va a ejecutar sin importar que contructor se ejecute
  {
    numeroHumanos++;
  }
}

public class EjemploStatic {

  // cuando tenemos algo static no dependemos de la creacion de un objeto
  public static void main(String[] args) {
    System.out.println(Humano.numeroHumanos);
    new Humano();
    new Humano("nacho");
    new Humano();
    System.out.println(Humano.numeroHumanos);
  }
}
