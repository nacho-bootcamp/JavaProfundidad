package Seccion15;

import java.io.File;

public class EjemploFile {
  public static void main(String[] args) {
    File f = new File("C:\\programacion\\Java\\Ejemplos");
    System.out.println("Is file " + f.isFile());
    System.out.println("Is directory " + f.isDirectory());
    System.out.println("Name" + f.getName());
    System.out.println("Can read " + f.canRead());
  }
}
