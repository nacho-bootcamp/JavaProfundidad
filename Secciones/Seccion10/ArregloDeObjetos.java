package Seccion10;

class Taco {
  private String sabor;
  private float precio;
  private boolean cebolla;
  private boolean cilantro;

  Taco(String sabor, float precio, boolean cebolla, boolean cilantro) {
    this.sabor = sabor;
    this.precio = precio;
    this.cebolla = cebolla;
    this.cilantro = cilantro;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  public String getSabor() {
    return sabor;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public boolean isCebolla() {
    return cebolla;
  }

  public void setCebolla(boolean cebolla) {
    this.cebolla = cebolla;
  }

  public boolean isCilantro() {
    return cilantro;
  }

  public void setCilantro(boolean cilantro) {
    this.cilantro = cilantro;
  }
}

public class ArregloDeObjetos {
  public static void main(String[] args) {
    Taco orden[] = new Taco[2];
    orden[0] = new Taco("Pastor", 10f, true, false);
    orden[1] = new Taco("Suadero", 20f, false, false);
    float cuenta = 0.0f;
    for (Taco taco : orden) {
      System.out.println("Sabor " + taco.getSabor());
      System.out.println("Precio " + taco.getPrecio());
      System.out.println("Cebolla " + taco.isCebolla());
      System.out.println("Cilantro " + taco.isCilantro());

      cuenta += taco.getPrecio();
    }
    System.out.println("Monto total " + cuenta);
  }
}
