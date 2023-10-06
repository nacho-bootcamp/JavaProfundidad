package EjercicioSeccion5;

public class Gato {
  String nombre;
  String raza;
  char genero;
  double peso;
  String color;
  String fechaNacimiento;

  Gato(String nombre, String raza, double peso) {
    this.nombre = nombre;
    this.raza = raza;
    this.peso = peso;
  }

  Gato(String nombre, String raza, double peso, char genero, String color, String fechaNacimiento) {
    this(nombre, raza, peso);
    this.genero = genero;
    this.color = color;
    this.fechaNacimiento = fechaNacimiento;
  }

  public void cazar() {
    System.out.println(nombre + " es un gato de raza " + raza + " que  el gusta cazar en el patio");
  }

  public void ronronear() {
    System.out.println(nombre + " es un gato que pesa " + peso + " y ronronea mucho");
  }

  public static void main(String[] args) {
    Gato gato1 = new Gato("Garfield", "Savannah", 19.8);
    gato1.cazar();

    gato1.ronronear();
  }
}
