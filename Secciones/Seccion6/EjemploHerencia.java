package Seccion6;

class Animal {
  String nombre;

  public void respirar() {
    System.out.println("Soy un animal y estoy respirando");
  }
}

class Perro extends Animal {

}

class Gato extends Animal {
}

public class EjemploHerencia {
  public static void main(String[] args) {

    Animal a = new Animal();

    Perro perro = new Perro();
    perro.respirar();
    perro.nombre = "Perlita";

    Gato gato1 = new Gato();
    gato1.respirar();

    // "instanceof" para ver si un objeto es de un tipo de clase
    // todas las clases se extend de Object

    System.out.println(a instanceof Animal);
    System.out.println(a instanceof Object);

    System.out.println(perro instanceof Animal);
    System.out.println(perro instanceof Object);
    System.out.println(perro instanceof Perro);

  }
}
