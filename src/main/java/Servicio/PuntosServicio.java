/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html  
 */
package Servicio;

import Objeto.Puntos;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos CrearPuntos(){
    Puntos puntos1 = new Puntos();
    
        System.out.println("Ingrese la primera coordenada: ");
        puntos1.setX1(leer.nextDouble());
         System.out.println("Ingrese la segunda coordenada: ");
        puntos1.setX2(leer.nextDouble());
         System.out.println("Ingrese la tercera coordenada: ");
        puntos1.setY1(leer.nextDouble());
         System.out.println("Ingrese la cuarta coordenada: ");
        puntos1.setY2(leer.nextDouble());
        
    
        
        return puntos1;
    }
    
   public double calcularDistancia (Puntos puntos1){
   
       // Primera manera de hacerlo:
       //distancia = 0;
       // distancia = fórmula;
       // return distancia;
       
       //Segunda manera de hacerlo:
        return Math.sqrt(Math.pow((puntos1.getX2()-puntos1.getX1()),2) + Math.pow((puntos1.getY2()-puntos1.getY1()),2));
       
     
       
   }
}
