package Seccion15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraDeArchivo {
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("C:\\programacion\\Alura");
    try (PrintWriter pw = new PrintWriter(f)) {
      pw.println("Hola");
      pw.println("Siganme en ");
      pw.println("INSTAGRAM");
    }
  }
}
