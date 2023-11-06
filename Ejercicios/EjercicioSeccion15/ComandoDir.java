package EjercicioSeccion15;

import java.io.File;

public class ComandoDir {
  public static void main(String[] args) {
    String directorio = "C:\\\\programacion\\\\Alura";
    listarArchivos(directorio);
  }

  public static void listarArchivos(String directorio) {
    File carpeta = new File(directorio);
    if (carpeta.isDirectory()) {
      File[] archivos = carpeta.listFiles();
      if (archivos != null) {
        System.out.println("Archivos en el directorio " + directorio + ":");
        for (File archivo : archivos) {
          if (archivo.isFile()) {
            System.out.println(archivo.getName());
          }
        }
      } else {
        System.out.println("El directorio está vacío.");
      }
    } else {
      System.out.println("La ruta especificada no es un directorio válido.");
    }
  }
}
