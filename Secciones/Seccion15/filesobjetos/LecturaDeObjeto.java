package Seccion15.filesobjetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaDeObjeto {
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    File file = new File("C:\\programacion\\Alura\\hola.txt");
    try (FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis)) {
      while (true) {
        try {

          Programador programador = (Programador) ois.readObject();
          System.out.println(programador.getNombre());
          System.out.println(programador.getLenguajeFavorito());
        } catch (EOFException e) {
          break;
        }
      }
    }
  }
}
