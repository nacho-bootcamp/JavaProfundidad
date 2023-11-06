package Seccion15.filesobjetos;

import java.io.Serializable;

public class Programador implements Serializable {
  private String nombre;
  private String lenguajeFavorito;

  public Programador() {

  }

  public Programador(String nombre, String lenguajeFavorito) {
    this.nombre = nombre;
    this.lenguajeFavorito = lenguajeFavorito;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getLenguajeFavorito() {
    return lenguajeFavorito;
  }

  public void setLenguajeFavorito(String lenguajeFavorito) {
    this.lenguajeFavorito = lenguajeFavorito;
  }
}
