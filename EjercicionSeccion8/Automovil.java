package EjercicionSeccion8;

public abstract class Automovil {
  String marca;
  String color;
  int velocidadMaxima;
  private int numeroDeSerie;
  private String marcaDeNeumaticos;

  Automovil(String marca, String color) {
    this.marca = marca;
    this.color = color;

  }

  public int getNumeroDeSerie() {
    return numeroDeSerie;
  }

  public void setNumeroDeSerie(int numeroDeSerie) {
    this.numeroDeSerie = numeroDeSerie;
  }

  public String getMarcaDeNeumatico() {
    return marcaDeNeumaticos;
  }

  public void setMarcaDeNeumatico(String marcaDeNeumaticos) {
    this.marcaDeNeumaticos = marcaDeNeumaticos;
  }

  public abstract double calcularConsumoDeGasolina();

  public abstract double calcularCostoPeaje();
}
