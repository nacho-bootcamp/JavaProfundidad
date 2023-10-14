package EjercicioSeccion11;

//Ejercicio 2
public class Nodo {

  private String dato;
  Nodo siguiente;

  Nodo(String dato, Nodo siguiente) {
    this.dato = dato;
    this.siguiente = siguiente;
  }

  public String getDato() {
    return dato;
  }

  public void setDato(String dato) {
    this.dato = dato;
  }

  public Nodo getSiguiente() {
    return siguiente;
  }

  public void setSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
  }
}
