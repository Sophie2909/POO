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
package Main;

import Objeto.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author sacevedo
 */
public class POOEjApr04 {

    
    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo();
        
        RectanguloServicio servicio = new RectanguloServicio();
        
        servicio.CrearRectangulo(rectangulo1);
        servicio.Superficie(rectangulo1);
        servicio.Perimetro(rectangulo1);
        servicio.Dibujo(rectangulo1);
        
    }
    
}
