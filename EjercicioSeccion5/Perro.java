package EjercicioSeccion5;

public class Perro {
  String nombre;
  String raza;
  int edad;
  char genero;
  double peso;
  String fechaNacimiento;

  Perro(String nombre, String raza) {
    this.nombre = nombre;
    this.raza = raza;
  };

  Perro(String nombre, String raza, double peso, char genero, String fechaNacimiento, int edad) {
    this(nombre, raza);
    this.genero = genero;
    this.peso = peso;
    this.fechaNacimiento = fechaNacimiento;
    this.edad = edad;
  }

  public void jugar(Perro perro2) {
    System.out.println(nombre + " le gusta jugar mucho con su amigo " + perro2.nombre);
  }

  public void ladrar() {
    System.out.println(nombre + "es una perro de raza " + raza + " que le gusta ladrar por las noches");
  }

  public static void main(String[] args) {

    Perro perro1 = new Perro("Zeus", "Dogo Argentina");
    Perro perro2 = new Perro("Hercules", "Pitbull", 25.5, 'M', "06/10/2020", 3);

    perro2.ladrar();
    perro1.jugar(perro2);
  }
}