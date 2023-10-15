package EjercicioSeccion15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MoverArchivo {
  public static void main(String[] args) {
    String origen = "C:\\\\programacion\\\\Alura";
    String destino = "C:\\programacion";

    try {
      moverArchivo(origen, destino);
      System.out.println("Archivo movido exitosamente.");
    } catch (IOException e) {
      System.err.println("Error al mover el archivo: " + e.getMessage());
    }
  }

  public static void moverArchivo(String origen, String destino) throws IOException {
    File archivoOrigen = new File(origen);
    File archivoDestino = new File(destino);

    if (!archivoOrigen.exists()) {
      throw new IOException("El archivo de origen no existe.");
    }

    if (archivoDestino.exists()) {
      throw new IOException("El archivo de destino ya existe.");
    }

    try (FileInputStream inputStream = new FileInputStream(archivoOrigen);
        FileOutputStream outputStream = new FileOutputStream(archivoDestino)) {

      byte[] buffer = new byte[1024];
      int length;

      while ((length = inputStream.read(buffer)) > 0) {
        outputStream.write(buffer, 0, length);
      }
    }

    if (archivoOrigen.delete()) {
      System.out.println("Archivo de origen eliminado con éxito.");
    } else {
      System.err.println("No se pudo eliminar el archivo de origen.");
    }
  }
}
