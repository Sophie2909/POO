/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Main;

import Objeto.Cancion;
import Servicio.CancionServicio;

/**
 *
 * @author sacevedo
 */
public class POOEjAprExt01 {
    
    public static void main(String[] args) {
       
      CancionServicio servicio = new CancionServicio();
      Cancion cancion1 = servicio.CrearCancion(); //new Cancion();
      
     
      
        System.out.println(cancion1.toString());
    }
    
       
    
}
