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
package Servicio;

import Objeto.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCircunferencia(Circunferencia circulo) {

        System.out.println("Ingrese el radio de la circunferencia: ");

        circulo.setRadio(leer.nextDouble());

    }

    public void area (Circunferencia circulo) {
        System.out.println("El area del círculo es: "+ (3.14*circulo.getRadio()));
        
    }
    
    public void perimetro (Circunferencia circulo) {
        System.out.println("El perímetro del círculo es: "+ (2*3.14*circulo.getRadio()));  
}
}
