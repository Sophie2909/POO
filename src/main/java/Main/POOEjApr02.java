/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Main;

import Objeto.Circunferencia;
import Servicio.CircunferenciaServicio;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class POOEjApr02 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        
        Circunferencia radio = new Circunferencia(leer.nextDouble());
        
        CircunferenciaServicio circulo = new CircunferenciaServicio();
        
        circulo.area(radio);
        
        circulo.perimetro(radio);
        
        //circulo.crearCircunferencia(radio); 
    }
    

}
