/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Objeto.Cafetera;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
  
  public Cafetera crearCafetera() {
    Cafetera cafetera = new Cafetera();
    System.out.println("Ingrese la capacidad mde la cafetera en ml: ");
    cafetera.setCantidadMaxima(this.leer.nextDouble());
    return cafetera;
  }
  
  public void llenarCafetera(Cafetera cafetera) {
    cafetera.setCantidadActual(cafetera.getCantidadMaxima());
    System.out.println("La cafetera tiene " + cafetera.getCantidadActual() + " ml de cafe.");
  }
  
  public void servirTaza(Cafetera cafetera) {
    System.out.println("Ingrese el tamade su taza en ml: ");
    double taza = this.leer.nextDouble();
    if (taza <= cafetera.getCantidadActual()) {
      cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
      System.out.println("Se ha llenado su taza!. Restan " + cafetera.getCantidadActual() + " ml de cafe.");
    } else {
      System.out.println("Cafe insuficiente.");
      System.out.println("El porcentaje que se ha llenado de la taza es: " + (100.0D * cafetera.getCantidadActual() / taza) + "%.");
      cafetera.setCantidadActual(0.0D);
    } 
  }
  
  public void vaciarCafetera(Cafetera cafetera) {
    if (cafetera.getCantidadActual() == 0.0D) {
      System.out.println("La cafetera se encuentra vacia.");
    } else {
      cafetera.setCantidadActual(0.0D);
      System.out.println("Se ha vaciado por completo la cafetera.");
    } 
  }
  
  public void agregarCafe(Cafetera cafetera) {
    System.out.println("Puede agregar un maximo de: " + (cafetera.getCantidadMaxima() - cafetera.getCantidadActual()) + " ml de cafe.");
    cafetera.setCantidadActual(cafetera.getCantidadActual() + this.leer.nextInt());
    System.out.println("Se ha agregado su cafe. Ahora cuenta con " + cafetera.getCantidadActual() + " ml de cafe.");
  }
}