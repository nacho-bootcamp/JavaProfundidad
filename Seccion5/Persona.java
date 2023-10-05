package Seccion5;

//Definicion de la clase
public class Persona {
  // Atributos
  String nombre;
  int edad;
  char genero;

  // Construcor
  Persona() {
    System.out.println("Esto es un Constructor");
  }

  Persona(String n, int ed, char g) {
    nombre = n;
    edad = ed;
    genero = g;
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

    Persona p1 = new Persona();
    p1.nombre = "Nacho";
    p1.edad = 22;
    p1.genero = 'M';
    p1.Informacion();
    p1.JugarVideosJuegos(p);
  }
}
