/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Servicio;

import Objeto.Libro;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro() {
    Libro libro = new Libro ();
    
        System.out.println("Ingrese el numero de ISBN: ");
        libro.setIsbn(leer.nextInt());
        System.out.println("Ingrese el nombre del titulo: ");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor: ");
        libro.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas: ");
        libro.setnPaginas(leer.nextInt());
        
        return libro;
}
public void mostrarLibro(Libro libro){
    System.out.println(libro.toString());
}
}

