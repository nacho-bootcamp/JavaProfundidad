package EjercicioSeccion11;

import java.util.ArrayList;
import java.util.List;

class Mascotas {
  private String raza;
  private int edad;
  private double velocidadMaxima;
  private char genero;
  private boolean vacunasAlDia;

  Mascotas(String raza, int edad, double velocidad, char genero, boolean vacunasAlDia) {
    this.raza = raza;
    this.edad = edad;
    this.velocidadMaxima = velocidad;
    this.genero = genero;
    this.vacunasAlDia = vacunasAlDia;
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

public class Ejercicio1 {
  public static void main(String[] args) {
    List<Mascotas> listaMascotas = new ArrayList<>();
    listaMascotas.add(new Mascotas("pitbull", 120, 120.5, 'M', false));
    listaMascotas.add(new Mascotas("Dogo", 3, 110.5, 'M', false));

    for (Mascotas mascotas : listaMascotas) {
      System.out.println("La raza es " + mascotas.getRaza());
      System.out.println("Tiene la edad de " + mascotas.getEdad() + " años");
      System.out.println("La corre a una velocidad de " + mascotas.getVelocidadMaxima());
      System.out.println("Es de genero " + mascotas.getGenero());
      System.out.println("¿Las vacunas las tiene al dia? " + mascotas.isVacunasAlDia());
    }
  }

}
