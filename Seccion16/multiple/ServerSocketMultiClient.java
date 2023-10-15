package Seccion16.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class WorkrScket extends Thread {
  private Socket client;

  public WorkrScket(Socket client) {
    this.client = client;
  }

  @Override
  public void run() {
    try (DataInputStream dis = new DataInputStream(client.getInputStream())) {
      String mensaje = null;
      do {
        mensaje = dis.readUTF();
        System.out.printf("%s Dice \n", client.getInetAddress().getHostName(), mensaje);
      } while (!"salir".equals(mensaje));
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

}

public class ServerSocketMultiClient {
  public static void main(String[] args) throws IOException {
    try (ServerSocket ss = new ServerSocket(8090);) {
      while (true) {
        System.out.println("Escuchando Clientes");
        Socket cliente = ss.accept();
        System.out.println("Cliente conectado " + cliente.getInetAddress().getHostName());
        new WorkrScket(cliente).start();

      }
    }
  }
}
