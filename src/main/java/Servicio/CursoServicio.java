/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicio;

import Objeto.Curso;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class CursoServicio {
  Scanner leer = new Scanner(System.in);
  
  public String[] cargarAlumnos(Curso curso1) {
    String[] alumnos = new String[(curso1.getAlumnos()).length];
    for (int i = 0; i < alumnos.length; i++) {
      System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
      alumnos[i] = this.leer.next();
    } 
    return alumnos;
  }
  
  public Curso crearCurso() {
    Curso curso1 = new Curso();
    System.out.println("Ingrese el nombre del curso: ");
    curso1.setNombreCurso(this.leer.next());
    System.out.println("Ingrese la cantidad de horas por dia que tiene el curso:");
    curso1.setCantidadHorasPorDia(this.leer.nextInt());
    System.out.println("Ingrese la cantidad de dias a la semana que tiene el curso: ");
    curso1.setCantidadDiasPorSemana(this.leer.nextInt());
    System.out.println("Ingrese el turno del curso: [MAÑANA] - [TARDE]");
    curso1.setTurno(this.leer.next().toLowerCase());
    System.out.println("Ingrese el precio que le pagan por hora: ");
    curso1.setPrecioPorHora(this.leer.nextDouble());
    System.out.println("Ingrese el nombre de sus alumnos: ");
    curso1.setAlumnos(cargarAlumnos(curso1));
    return curso1;
  }
  
  public void calcularGananciaSemanal(Curso curso1) {
    double gananciaSemanal = curso1.getPrecioPorHora() * curso1.getCantidadHorasPorDia() * curso1.getCantidadDiasPorSemana() * (curso1.getAlumnos()).length;
    System.out.println("Usted tendruna ganancia semanal de: $" + gananciaSemanal);
  }
}