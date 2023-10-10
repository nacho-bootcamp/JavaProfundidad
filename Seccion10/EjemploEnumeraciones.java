package Seccion10;

//para poder poner  CHILE(constante)("Chile") se necesita crear el constructor 
enum SaborPalomitas {
  /*
   * La enum son constante agrupadas de acuerdo al mismo contexto y que pueden
   * tener sus propios atributos
   * sus propios metodos
   * y propios constructores
   */
  CHILE("Chile", 20f), MANTEQUILLA("Mantequilla", 40), QUESO("Quesito", 18);

  private String nombreDeVenta;
  private float precio;

  private SaborPalomitas(String nombreDeVenta, float precio) {
    this.nombreDeVenta = nombreDeVenta;
    this.precio = precio;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public String getNombreDeVenta() {
    return nombreDeVenta;
  }

  public void setNombreDeVenta(String nombreDeVenta) {
    this.nombreDeVenta = nombreDeVenta;
  }

}

public class EjemploEnumeraciones {
  public static void main(String[] args) {
    SaborPalomitas queso = SaborPalomitas.QUESO;
    System.out.println(queso.name());
    System.out.println(queso.getNombreDeVenta());
    System.out.println(queso.getPrecio());
  }
}
