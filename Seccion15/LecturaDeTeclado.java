package Seccion15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDeTeclado {

  public static String readMessage(String prompt) throws IOException {
    System.out.println(prompt);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    return br.readLine();
  }

  public static int readInteger(String prompt) throws NumberFormatException, IOException {
    return Integer.parseInt(readMessage(prompt));
  }

  public static void main(String[] args) throws IOException {
    String nombre = readMessage("Como te llamas");
    System.out.println("Te llamas " + nombre);
    int edad = readInteger("Cuantos anios tienes ?");
    System.out.println("Tienes " + edad);
  }
}
