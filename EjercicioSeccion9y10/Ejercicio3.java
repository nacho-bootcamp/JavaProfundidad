package EjercicioSeccion9y10;

class Mascotas {
  private String raza;
  private int edad;
  private double velocidadMaxima;
  private char genero;
  private boolean vacunasAlDia;

  Mascotas(String raza, int edad, double velocidad, char genero, boolean castrado) {
    this.raza = raza;
    this.edad = edad;
    this.velocidadMaxima = velocidad;
    this.genero = genero;
    this.vacunasAlDia = castrado;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getVelocidadMaxima() {
    return velocidadMaxima;
  }

  public void setVelocidadMaxima(double velocidad) {
    this.velocidadMaxima = velocidad;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public boolean isVacunasAlDia() {
    return vacunasAlDia;
  }

  public void setVacunasAlDia(boolean castrado) {
    this.vacunasAlDia = castrado;
  }

}

public class Ejercicio3 {
  public static void main(String[] args) {
    Mascotas arregloMascota[] = new Mascotas[2];
    arregloMascota[0] = new Mascotas("Pitbull", 2, 40.0, 'H', true);
    arregloMascota[1] = new Mascotas("Dogo Argentino", 4, 48.5, 'M', true);

    for (Mascotas mascotas : arregloMascota) {
      System.out.println("La raza es " + mascotas.getRaza());
      System.out.println("Tiene la edad de " + mascotas.getEdad() + " años");
      System.out.println("La corre a una velocidad de " + mascotas.getVelocidadMaxima());
      System.out.println("Es de genero " + mascotas.getGenero());
      System.out.println("¿Las vacunas las tiene al dia? " + mascotas.isVacunasAlDia());
    }
  }

}
