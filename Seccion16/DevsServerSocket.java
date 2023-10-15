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
      Socket cliente = socket.accept();
      System.out.printf("Cliente %s conectado \n", cliente.getInetAddress().getHostName());
      DataInputStream dis = new DataInputStream(cliente.getInputStream());
      String mensaje = null;
      do {
        mensaje = dis.readUTF();
        System.out.printf("%s dice ; %s", cliente.getInetAddress().getHostName(), mensaje);
      } while (!"salir".equals(mensaje));
      System.out.println("Conexion cerrada");
      socket.close();
      cliente.close();
      dis.close();
    }
  }
}
