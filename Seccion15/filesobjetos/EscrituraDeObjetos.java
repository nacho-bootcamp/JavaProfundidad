package Seccion15.filesobjetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraDeObjetos {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    Programador[] p = { new Programador("nacho", "Java"),
        new Programador("juan", "Java"),
        new Programador("Eri", "Java") };
    File file = new File("C:\\programacion\\Alura\\hola.txt");
    if (!file.exists()) {
      file.createNewFile();
    }
    try (FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {

      for (Programador programador : p) {
        oos.writeObject(programador);
      }
    }
  }
}
