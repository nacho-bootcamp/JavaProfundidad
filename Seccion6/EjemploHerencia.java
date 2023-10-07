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
    Perro perro = new Perro();
    perro.respirar();
    perro.nombre = "Perlita";

    Gato gato1 = new Gato();
    gato1.respirar();
  }
}
