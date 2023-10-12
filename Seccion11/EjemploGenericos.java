package Seccion11;

class Transporte {
}

class Coche extends Transporte {
}

class Auto extends Coche {
}

class Genericos<T extends Transporte> {
  private T valor;

  public Genericos(T valor) {
    this.valor = valor;
  }

  public T getValor() {
    return valor;
  }

  public void setValor(T valor) {
    this.valor = valor;
  }
}

public class EjemploGenericos {
  public static void main(String[] args) {
    Genericos<Transporte> bean = new Genericos<>(new Coche());
    System.out.println(bean.getValor());

  }
}
