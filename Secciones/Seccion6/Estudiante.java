package Seccion6;

// si ponemos final a una clase lo que hace es que otras clases no puedan
//heredar de esta clase
public class Estudiante extends Persona {
  int numeroDeCuenta;

  Estudiante(int numeroDeCuenta, String nombre, String fechaDeNacimiento) {
    super(nombre, fechaDeNacimiento);
    this.numeroDeCuenta = numeroDeCuenta;
  }
  // Esto se llama Sobre Escritura de Metodo
  // Para Sobre escribir un metodo se necesita la notacion
  // @Override esto me permite que renunciemos al metodo que posee la clase padre

  // con this no referimos a nosotros mismo con super no referimos a la clase
  // padre
  @Override
  void dormir() {
    super.dormir();
    System.out.println("Soy " + nombre + " y yo no duermo");
  }

  void aprobar() {
    System.out.println("Soy " + nombre + " y aprobe mi examen");
  }

  void reprobar() {
    System.out.println("Soy " + nombre + " y desaprobe mi examen");
  }

  float presentarExamen(float nota) {
    return nota;
  }
}

// final en clases no puedo heredar de la clase que estoy marcando como final
// final en metodos esos metodos no se pueden sobreescribir
// final en tipos de datos primitivos se vuelven constantes
// final en objetos no puedo modificar la referencia de ese objeto