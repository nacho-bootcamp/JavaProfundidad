package Seccion5;

//Definicion de la clase
public class Persona {
  // Atributos
  String nombre;
  int edad;
  char genero;

  // Metodos
  void Informacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Genero: " + genero);
  }

  void JugarVideosJuegos(Persona p) {
    System.out.println(nombre + " Esta jugando con " + p.nombre);
  }

  public static void main(String[] args) {
    Persona p = new Persona();
    p.nombre = "Eri";
    p.edad = 25;
    p.genero = 'F';
    p.Informacion();

    Persona p1 = new Persona();
    p1.nombre = "Nacho";
    p1.edad = 22;
    p1.genero = 'M';
    p1.Informacion();
    p1.JugarVideosJuegos(p);
  }
}
