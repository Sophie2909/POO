/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicio;

import Objeto.Matematica;

/**
 *
 * @author sacevedo
 */
public class MatematicaServicio {
  public void devolverMayor(Matematica objeto1) {
    if (objeto1.getNum1() > objeto1.getNum2()) {
      System.out.println("EL numero 1-[" + objeto1.getNum1() + "] es el mayor.");
    } else {
      System.out.println("EL numero 2-[" + objeto1.getNum2() + "] es el mayor.");
    } 
  }
  
  public void calcularPotencia(Matematica objeto1) {
    if (objeto1.getNum1() > objeto1.getNum2()) {
      System.out.println("El numero 1 elevado al numero 2 es: " + Math.pow(Math.round(objeto1.getNum1()), Math.round(objeto1.getNum2())));
    } else {
      System.out.println("El numero 2 elevado al numero 1 es: " + Math.pow(Math.round(objeto1.getNum2()), Math.round(objeto1.getNum1())));
    } 
  }
  
  public void calcularRaiz(Matematica objeto1) {
    if (objeto1.getNum1() > objeto1.getNum2()) {
      System.out.println("La raiz del numero 2 es: " + Math.sqrt(Math.abs(objeto1.getNum2())));
    } else {
      System.out.println("La raiz del numero 1 es: " + Math.sqrt(Math.abs(objeto1.getNum1())));
    } 
  }
}