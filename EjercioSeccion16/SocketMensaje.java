package EjercioSeccion16;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketMensaje {
  public static void main(String[] args) throws IOException {
    try (

        ServerSocket serverSocket = new ServerSocket(8090);) {

      Socket clienteSocket = serverSocket.accept();

      DataInputStream dis = new DataInputStream(clienteSocket.getInputStream());
    }
  }
}
