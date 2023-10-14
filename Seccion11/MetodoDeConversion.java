package Seccion11;

public class MetodoDeConversion {
  public static void main(String[] args) {
    Integer x = 10;
    double d = x.doubleValue();
    float f = x.floatValue();
    long l = x.longValue();

    String valor = "10";
    int val = Integer.parseInt(valor);
    System.out.println(val);
    System.out.println(d);
    System.out.println(f);
    System.out.println(l);
  }
}
