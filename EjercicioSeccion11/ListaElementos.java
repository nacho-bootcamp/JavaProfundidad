package EjercicioSeccion11;

import java.util.ArrayList;
import java.util.List;

public class ListaElementos<T> {
  private List<T> elementos;

  public ListaElementos() {
    elementos = new ArrayList<>();
  }

  public boolean agregarElemento(T elemento) {
    if (!elementos.contains(elemento)) {
      elementos.add(elemento);
      return true;
    }
    return false;
  }

  public boolean borrarElemento(T elemento) {
    return elementos.remove(elemento);
  }

  public boolean buscarElemento(T elemento) {
    return elementos.contains(elemento);
  }

  public List<T> obtenerElementos() {
    return elementos;
  }

  public void borrarTodosElementos() {
    elementos.clear();
  }

  public static void main(String[] args) {
    ListaElementos<Integer> lista = new ListaElementos<>();
    lista.agregarElemento(1);
    lista.agregarElemento(2);
    lista.agregarElemento(3);
    lista.agregarElemento(1); // No se agregará, ya que es un duplicado

    System.out.println("Elementos en la lista: " + lista.obtenerElementos());

    lista.borrarElemento(2);
    System.out.println("Elementos en la lista después de borrar 2: " + lista.obtenerElementos());

    System.out.println("¿El elemento 3 está en la lista? " + lista.buscarElemento(3));
    System.out.println("¿El elemento 2 está en la lista? " + lista.buscarElemento(2));
  }
}
