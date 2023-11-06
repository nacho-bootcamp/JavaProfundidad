package Seccion16;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DevsServerSocket {
  public static void main(String[] args) throws IOException {

    try (

        ServerSocket socket = new ServerSocket(8090);) {
      // detiene la ejecucion hasta que se conecte un cliente
      System.out.println("Escuchando peticiones");
      // usas el método accept() para esperar y aceptar conexiones entrantes.
      Socket cliente = socket.accept();
      System.out.printf("Cliente %s conectado \n", cliente.getInetAddress().getHostName());
      // se utiliza para leer datos primitivos y tipos de datos específicos a partir
      // de una secuencia de entrada binaria

      // El constructor de DataInputStream toma un objeto InputStream como parámetro.
      // Un InputStream se utiliza para leer secuencias de bytes
      DataInputStream dis = new DataInputStream(cliente.getInputStream());
      String mensaje = null;
      do {
        mensaje = dis.readUTF();
        System.out.printf("%s dice ; %s \n", cliente.getInetAddress().getHostName(), mensaje);
      } while (!"salir".equals(mensaje));
      System.out.println("Conexion cerrada");
      socket.close();
      cliente.close();
      dis.close();
    }
  }
}
