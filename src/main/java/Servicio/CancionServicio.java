/*
 Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Servicio;

import Objeto.Cancion;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class CancionServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cancion CrearCancion (){
    Cancion cancion1 = new Cancion();
    
        System.out.println("Ingrese el título de la canción: ");
        cancion1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        cancion1.setAutor(leer.nextLine());
        
 
        
    
    
    return cancion1;
    
        
        
}
}
