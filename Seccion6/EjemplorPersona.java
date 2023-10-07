package Seccion6;

public class EjemplorPersona {

  public static void main(String[] args) {

    Estudiante alumno = new Estudiante();

    alumno.nombre = "Nacho";
    alumno.fechaDeNacimiento = "30/04/2001";

    alumno.aprobar();
    alumno.dormir();
    alumno.reprobar();
  }
}
