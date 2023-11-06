package Seccion11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploHashMap {
  public static void main(String[] args) {
    Map<String, String> diccionario = new HashMap<>();
    // no puedo tener key duplicadas si ya existe una key se va a sobre escribir

    diccionario.put("Nacho", "Asi me llamo");
    diccionario.put("Consiti", "Empresa del Salvador");
    diccionario.put("Java", "estoy aprendiendo");
    diccionario.put(null, "estot aprendiendo");
    System.out.println(diccionario);

    for (String llave : diccionario.keySet()) {
      System.out.println(llave);
    }

    for (Entry<String, String> entry : diccionario.entrySet()) {
      System.out.println(entry.getKey());
    }

    // va por 16 porque es la cantidad que se crea del 0 al 15
    System.out.println("Java".hashCode() % 16);
    /**
     * 0
     * 1
     * 2 2301506,java,estoy ....
     * 
     * 
     * 16
     */
  }
}
