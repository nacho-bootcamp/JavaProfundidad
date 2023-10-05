package Seccion5;

//Definicion de la clase
public class Persona {
  // Atributos
  String nombre;
  int edad;
  char genero;

  // Construcor
  Persona() {
    // constructor por defecto
    this("nombre por defecto", 22, 'M');
    System.out.println("Esto es un Constructor");
  }

  Persona(String nombre, int edad, char genero) {
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
  }

  // Metodos
  void Informacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Genero: " + genero);
  }

  void JugarVideosJuegos(Persona p) {
    System.out.println(nombre + " Esta jugando a la play con " + p.nombre);
  }

  public static void main(String[] args) {
    Persona p = new Persona("Eri", 25, 'F');
    p.Informacion();

    Persona p1 = new Persona("Nacho", 22, 'M');
    p1.Informacion();
    p1.JugarVideosJuegos(p);

    new Persona().Informacion();
  }
}
