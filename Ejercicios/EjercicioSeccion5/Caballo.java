package EjercicioSeccion5;

public class Caballo {
  String nombre;
  char genero;
  double peso;
  double estatura;
  String fechaNacimiento;

  Caballo(String nombre, String fechaNacimiento) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
  }

  Caballo(String nombre, char genero, double estatura, double peso, String fechaNacimiento) {
    this(nombre, fechaNacimiento);
    this.genero = genero;
    this.estatura = estatura;
    this.peso = peso;
  }

  public void relinchar() {
    System.out.println(nombre + " esta relinchando");
  }

  public void galopar() {
    System.out.println(nombre + " nacio en " + fechaNacimiento + " y galopa en el campo muy rapido");
  }

  public static void main(String args[]) {

    Caballo c1 = new Caballo("Richard", "30/01/2000");
    c1.galopar();
    Caballo c2 = new Caballo("mike", 'M', 170.8, 100, "05/01/1998");
    c2.relinchar();
  }

}
