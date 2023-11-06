package Seccion12;

/**
 * Puedo quitar el throws del metodo padre pero no puedo hacer
 * que el hijo tenga una excepcion que el padre no tiene
 */

class Foo {
  void print() throws Exception {

  }
}

class Bar extends Foo {
  @Override
  void print() {

  }
}

public class HerenciaThrows {

}
