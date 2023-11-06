package Seccion6;

public class EjemplorPersona {

  public static void main(String[] args) {

    Estudiante alumno = new Estudiante(1028165, "Nacho", "30/04/2001");
    alumno.aprobar();
    alumno.dormir();
    alumno.reprobar();

    Empleado empleado1 = new Empleado("Eri", "05/01/1998", 300000);
    empleado1.trabajar();
  }
}
