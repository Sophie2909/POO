/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicio;

import Objeto.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class RectanguloServicio {

    public void CrearRectangulo(Rectangulo numero1) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la altura: ");
        numero1.setAltura(leer.nextFloat());

        System.out.println("Ingrese la base: ");
        numero1.setBase(leer.nextFloat());

    }

    public void Superficie(Rectangulo superficie) {
        System.out.println("\nLa superficie del rectángulo es: " + superficie.getAltura() * superficie.getBase());
    }

    public void Perimetro(Rectangulo perimetro) {
        System.out.println("\nEl perímetro del rectángulo es: " + (perimetro.getAltura() + perimetro.getBase()) * 2);
    }
    
    public void Dibujo(Rectangulo dibujo){
        for (int i=0; i < dibujo.getBase(); i++){
            for (int j=0; j < dibujo.getAltura(); j++){
                if (i==0 || j==0 || i==dibujo.getBase()-1 || j==dibujo.getAltura()-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
               
                    
                }
            }
               System.out.println("");
 
        }
    }
}

